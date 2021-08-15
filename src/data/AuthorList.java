package data;

import java.util.*;
import util.MyToys;

public class AuthorList {
    private ArrayList < Author > authorList = new ArrayList < > ();

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }
    
    public int searchAuthorById(String id) {
        for (int i = 0; i < authorList.size(); i++)
            if (authorList.get(i).getAuthorId().compareToIgnoreCase(id) == 0)
                return i;
        return -1;
    }

    public Author searchObjectAuthorById(String id) {
        if (authorList.isEmpty())
            return null;
        for (Author author: authorList)
            if (author.getAuthorId().compareToIgnoreCase(id) == 0)
                return author;
        return null;
    }

//    public void addNewAuthor() {
//        int id;
//        long basicSalary;
//        String name, gender;
//        int pos;
//        do {
//            id = MyToys.getAnInteger("Enter author's ID: ", "ID must be an positive " +
//                "integer", 1, Integer.MAX_VALUE);
//            pos = searchAuthorByID(id);
//            if (pos != -1)
//                System.err.println("This ID is already exist");
//        } while (pos != -1);
//        name = MyToys.getAName("Enter author's name: ",
//            "Không bỏ trống tên. Tên chỉ gồm các kí tự và khoảng trắng");
//        gender = MyToys.getGender("Enter author's gender: \nF(FEMALE) M(MALE) X(OTHER): ", "Invalid", "F M X");
//        basicSalary = MyToys.getAnLong("Enter author's basic salary: ", "Salary must be an positive " +
//            "integer", 1, Long.MAX_VALUE);
//        authorList.add(new Author(id, name, gender, basicSalary));
//        System.out.println("A author's profile is sucessfully added");
//    }
//
//    public void addNewManager() {
//        int id;
//        long basicSalary, bonusSalary;
//        String name, gender;
//        int pos;
//        do {
//            id = MyToys.getAnInteger("Enter manager's ID: ", "ID must be an positive " +
//                "integer", 1, Integer.MAX_VALUE);
//            pos = searchAuthorByID(id);
//            if (pos != -1)
//                System.err.println("This ID is already exist");
//        } while (pos != -1);
//        name = MyToys.getAName("Enter manager's name: ",
//            "Không bỏ trống tên. Tên chỉ gồm các kí tự và khoảng trắng");
//        gender = MyToys.getGender("Enter manager's gender: \nF(FEMALE) M(MALE) X(OTHER): ", "Invalid", "F M X");
//        basicSalary = MyToys.getAnLong("Enter manager's basic salary: ", "Salary must be an positive " +
//            "integer", 1, Long.MAX_VALUE);
//        bonusSalary = MyToys.getAnLong("Enter manager's bonus salary: ", "Salary must be an positive " +
//            "integer", 1, Long.MAX_VALUE);
//        Author x = new Manager(id, name, gender, basicSalary, bonusSalary);
//        authorList.add(x);
//        System.out.println("A manager's profile is sucessfully added");
//    }
//
//    public void update() {
//        int id;
//        Author x;
//        id = MyToys.getAnInteger("Enter author's ID: ", "ID must be an positive " +
//            "integer", 1, Integer.MAX_VALUE);
//        x = searchObjectAuthorByID(id);
//        System.out.println("-------------------------------------------------");
//        if (x == null)
//            System.err.println("Not found");
//        else {
//            System.out.println("Here is the author before updating");
//            x.showProfile();
//            Menu menu = new Menu("updating author");
//            menu.addNewOption("1. Update name");
//            menu.addNewOption("2. Update gender");
//            menu.addNewOption("3. Update basic salary");
//            if (x instanceof Manager)
//                menu.addNewOption("4. Update bonus salary");
//            menu.printMenu();
//            int choice = menu.getChoice();
//            switch (choice) {
//                case 1:
//                    {
//                        String name = MyToys.getAName("Enter author's name: ",
//                            "Không bỏ trống tên. Tên chỉ gồm các kí tự và khoảng trắng");
//                        x.setName(name);
//                        break;
//                    }
//                case 2:
//                    {
//                        String gender = MyToys.getGender("Enter author's gender: \n" +
//                            "F(FEMALE) M(MALE) X(OTHER): ", "Invalid", "F M X");
//                        x.setGender(gender);
//                        break;
//                    }
//                case 3:
//                    {
//                        long basicSalary = MyToys.getAnLong("Enter author's basic salary: ", "Salary must be an positive " +
//                            "integer", 1, Long.MAX_VALUE);
//                        x.setBasicSalary(basicSalary);
//                        break;
//                    }
//                case 4:
//                    {
//                        long bonusSalary = MyToys.getAnLong("Enter author's bonus salary: ", "Salary must be an positive " +
//                            "integer", 1, Long.MAX_VALUE);
//                        ((Manager) x).setBonusSalary(bonusSalary);
//                        break;
//                    }
//            }
//            System.out.println("Sucessfully updated");
//        }
//    }
//    
//    public void addNewRelationship() {
//        Manager m;
//        Author s;
//        int id;
//        printManagerListAscByID();
//        if (authorList.isEmpty()) 
//            return;
//        id = MyToys.getAnInteger("Enter manager's ID: ", "ID must be an positive " +
//            "integer", 1, Integer.MAX_VALUE);
//        m = searchObjectManagerByID(id);
//        if (m == null) {
//            System.err.println("Not found");
//            System.err.println("Liên kết thất bại");
//            return;
//        }
//        printAuthorListAscByID(m);
//        id = MyToys.getAnInteger("Enter author's ID: ", "ID must be an positive " +
//            "integer", 1, Integer.MAX_VALUE);
//        s = searchObjectAuthorByID(id, m);
//        if (s == null) {
//            System.err.println("Not found");
//            System.err.println("Liên kết thất bại");
//            return;
//        }
////        s.setManager(m);
////        System.out.println("Liên kết thành công");
//
//        if (m.getManager() != null && m.getManager().equals(s)) 
//            m.setManager(null);
//        s.setManager(m);
//        System.out.println("Liên kết thành công");
//       
//        
//    }
//
//    public void removeAuthor() {
//        if (authorList.isEmpty()) 
//            System.out.println("Danh sách trống");
//        int id, pos;
//        id = MyToys.getAnInteger("Enter author's ID: ", "ID must be an positive " +
//            "integer", 1, Integer.MAX_VALUE);
//        pos = searchAuthorByID(id);
//        if (pos == -1) {
//            System.err.println("Not found");
//        } else {
//            for (Author author : authorList) {
//                if (author.getManager() != null && author.getManager().equals(authorList.get(pos))) 
//                    author.setManager(null);
//            }
//            authorList.remove(pos);
//            System.out.println("The author information is remove sucessfully");
//        }
//    }
//
//    public void printManagerListAscByID() {
//        if (authorList.isEmpty()) {
//            System.out.println("The storage is empty. Nothing to print");
//            return;
//        }
//        Collections.sort(authorList);
//        System.out.println("-------------------------------------------------");
//        System.out.println("Here is the manager list");
//        String header = String.format("|%-4s|%-15s|%-6s|%-10s|%-10s|",
//            "ID", "NAME", "GENDER", "BASIC", "BONUS");
//        System.out.println(header);
//        for (Author st: authorList) {
//            if (st instanceof Manager) {
//                st.showProfile();
//            }
//        }
//    }
//
//    public void printAuthorListAscByID(Manager manager) {
//        if (authorList.isEmpty()) {
//            System.out.println("The storage is empty. Nothing to print");
//            return;
//        }
//        Collections.sort(authorList);
//        System.out.println("-------------------------------------------------");
//        System.out.println("Here is the author list");
//        String header = String.format("|%-4s|%-15s|%-6s|%-10s|%-10s|",
//            "ID", "NAME", "GENDER", "BASIC", "BONUS");
//        System.out.println(header);
//        for (Author st: authorList) {
//            if (!(st.equals(manager))) {
//                st.showProfile();
//            }
//        }
//    }
//
//    public void printAuthorListAscByID() {
//        if (authorList.isEmpty()) {
//            System.out.println("The storage is empty. Nothing to print");
//            return;
//        }
//        Collections.sort(authorList);
//        System.out.println("-------------------------------------------------");
//        System.out.println("Here is the author list");
//        String header = String.format("|%-4s|%-15s|%-6s|%-10s|%-10s|",
//            "ID", "NAME", "GENDER", "BASIC", "BONUS");
//        System.out.println(header);
//        for (Author st: authorList)
//            st.showProfile();
//    }
//
//    public void printAuthorListAscByName() {
//        if (authorList.isEmpty()) {
//            System.out.println("The storage is empty. Nothing to print");
//            return;
//        }
//        Collections.sort(authorList, new Comparator < Author > () {
//            @Override
//            public int compare(Author p1, Author p2) {
//                return p1.getName().compareToIgnoreCase(p2.getName());
//            }
//        });
//        System.out.println("-------------------------------------------------");
//        System.out.println("Here is the author list");
//        String header = String.format("|%-4s|%-15s|%-6s|%-10s|%-10s|",
//            "ID", "NAME", "GENDER", "BASIC", "BONUS");
//        System.out.println(header);
//        for (Author st: authorList)
//            st.showProfile();
//    }


}