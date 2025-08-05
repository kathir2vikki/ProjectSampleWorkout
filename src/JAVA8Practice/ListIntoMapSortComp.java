package JAVA8Practice;


/*
How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Notes
        {
          int id;
          String notes;

            public Notes(int id, String notes, Long tagId) {
                this.id = id;
                this.notes = notes;
                this.tagId = tagId;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

            public Long getTagId() {
                return tagId;
            }

            public void setTagId(Long tagId) {
                this.tagId = tagId;
            }

            Long tagId;
        }
public class ListIntoMapSortComp {

    public static void main(String[] a) {
        List<Notes> listNotes = new ArrayList<>();

        listNotes.add(new Notes(1, "note1", 22L));
        listNotes.add(new Notes(2, "note2", 33L));
        listNotes.add(new Notes(3, "note3", 33L));
        listNotes.add(new Notes(4, "note4", 44L));

        HashMap<Long,String> hm = listNotes.stream()
                .sorted(Comparator.comparing(Notes::getTagId)
                        .reversed())
                .collect(Collectors.toMap(Notes::getTagId,Notes::getNotes, (x,y)->x, HashMap::new));

        hm.forEach((x,y) -> System.out.println(x + "======" + y));


    }


}
