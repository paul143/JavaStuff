
import java.util.*;

public class RemoveDuplicatesFromObject{

 public static void main(String[] args) {
    Employee b1 = new Employee("A", "sam", "a", "desc");
    Employee b2 = new Employee("B", "ram", "b", "desc");
    Employee b3 = new Employee("C", "cam", "c", "desc");
    Employee b4 = new Employee("A", "sam", "a", "desc");
    Employee b5 = new Employee("D", "dam", "d", "desc");
    List<Employee> list = new ArrayList();
    list.add(b1);
    list.add(b2);
    list.add(b3);
    list.add(b4);       
    list.add(b5);

    //Removing Duplicates;
    Set<Employee> s= new HashSet<Employee>();
    s.addAll(list);         
    list = new ArrayList<Employee>();
    list.addAll(s);        
    //Now the List has only the identical Elements
    
for (int x=0; x<list.size(); x++)
    System.out.println(list.get(x).getTitle() +" " + list.get(x).getAuthor()  );

   // System.out.println();
}
}






class Employee {
    private String title;
    private String author;
    private String url;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;    

    Employee(String title, String author, String url, String description)
    {
        this.title = title;
        this.author = author;
        this.url = url;
        this.description = description; 
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Employee)
        {
            Employee temp = (Employee) obj;
            if(this.title == temp.title && this.author== temp.author && this.url == temp.url && this.description == temp.description)
                return true;
        }
        return false;

    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub

        return (this.title.hashCode() + this.author.hashCode() + this.url.hashCode() + this.description.hashCode());        
    }
}
