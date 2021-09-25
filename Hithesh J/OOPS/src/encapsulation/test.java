package encapsulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

class studentD{
    private int roll_no;
    private String name;
    private int total_mark;

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_mark() {
        return total_mark;
    }

    public void setTotal_mark(int total_mark) {
        this.total_mark = total_mark;
    }
}

public class test {
    public static void main(String[] args) {
        Scanner inp=new Scanner(in);
        ArrayList<studentD> list = new ArrayList<>();
        ArrayList<studentD>list1 = new ArrayList<>();
        out.println("Enter the number of students:");
        int n=inp.nextInt();
        for(int i=0;i<n;i++) {
            studentD ob = new studentD();
            out.println("Enter Name ");
            ob.setName(inp.next());
            out.println("Enter Roll number ");
            ob.setRoll_no(inp.nextInt());
            out.println("Enter Marks ");
            ob.setTotal_mark(inp.nextInt());
            list.add(ob);
        }
        for(studentD st : list){//create a variable for studentD which should run through the list
            out.println("For loop one");
            out.println("Name : " + st.getName());
            out.println("Roll number : " + st.getRoll_no());
            out.println("Total marks : " + st.getTotal_mark());
        }

        for(int i = 0; i < list.size(); i++){
            out.println("For loop two");
            out.println("Name : " + list.get(i).getName());
            out.println("Roll number : " + list.get(i).getRoll_no());
            out.println("Total marks : " + list.get(i).getTotal_mark());
        }

        Iterator<studentD> itr = list.iterator();

        while (itr.hasNext()){
            out.println("For loop three");
            out.println("Name : " + itr.next().getName());
            out.println("Roll number : " + itr.next().getRoll_no());
            out.println("Total marks : " + itr.next().getTotal_mark());
        }

        // removing of list

        list.remove(1);

        out.println("list after remove");
        for(studentD st : list){

            out.println("Name : " + st.getName());
            out.println("Roll number : " + st.getRoll_no());
            out.println("Total marks : " + st.getTotal_mark());
        }

    }
}
