
package harschr.selfmotivator.model;

public class Training {
    private String name;
    private String activity1;
    private  int length_training1;
    private String activity2;
    private  int length_training2;
    private String activity3;
    private  int length_training3;
    private String activity4;
    private  int length_training4;
    private String activity5;
    private  int length_training5;
    private int length_break;
    private int recurrence;

    public Training(String name, String activity1, int length_training1, String activity2, int length_training2, String activity3, int length_training3, String activity4, int length_training4, String activity5, int length_training5, int length_break, int recurrence) {
        this.name = name;
        this.activity1 = activity1;
        this.length_training1 = length_training1;
        this.activity2 = activity2;
        this.length_training2 = length_training2;
        this.activity3 = activity3;
        this.length_training3 = length_training3;
        this.activity4 = activity4;
        this.length_training4 = length_training4;
        this.activity5 = activity5;
        this.length_training5 = length_training5;
        this.length_break = length_break;
        this.recurrence = recurrence;
    }

    public Training() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity1() {
        return activity1;
    }

    public void setActivity1(String activity1) {
        this.activity1 = activity1;
    }

    public int getLength_training1() {
        return length_training1;
    }

    public void setLength_training1(int length_training1) {
        this.length_training1 = length_training1;
    }

    public String getActivity2() {
        return activity2;
    }

    public void setActivity2(String activity2) {
        this.activity2 = activity2;
    }

    public int getLength_training2() {
        return length_training2;
    }

    public void setLength_training2(int length_training2) {
        this.length_training2 = length_training2;
    }

    public String getActivity3() {
        return activity3;
    }

    public void setActivity3(String activity3) {
        this.activity3 = activity3;
    }

    public int getLength_training3() {
        return length_training3;
    }

    public void setLength_training3(int length_training3) {
        this.length_training3 = length_training3;
    }

    public String getActivity4() {
        return activity4;
    }

    public void setActivity4(String activity4) {
        this.activity4 = activity4;
    }

    public int getLength_training4() {
        return length_training4;
    }

    public void setLength_training4(int length_training4) {
        this.length_training4 = length_training4;
    }

    public String getActivity5() {
        return activity5;
    }

    public void setActivity5(String activity5) {
        this.activity5 = activity5;
    }

    public int getLength_training5() {
        return length_training5;
    }

    public void setLength_training5(int length_training5) {
        this.length_training5 = length_training5;
    }

    public int getLength_break() {
        return length_break;
    }

    public void setLength_break(int length_break) {
        this.length_break = length_break;
    }

    public int getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(int recurrence) {
        this.recurrence = recurrence;
    }

}