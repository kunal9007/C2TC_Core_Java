    //Java program to overload constructors  
class ConOL{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    ConOL(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    ConOL(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    ConOL s1 = new ConOL(111,"Karan");  
    ConOL s2 = new ConOL(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  