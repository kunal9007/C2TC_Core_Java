    //Java program to initialize the values from one object to another object.  
    class ConCP{  
        int id;  
        String name;  
        //constructor to initialize integer and string  
        ConCP(int i,String n){  
        id = i;  
        name = n;  
        }  
        //constructor to initialize another object  
        ConCP(ConCP s){  
        id = s.id;  
        name =s.name;  
        }  
        void display(){System.out.println(id+" "+name);}  
       
        public static void main(String args[]){  
        ConCP s1 = new ConCP(111,"Karan");  
        ConCP s2 = new ConCP(s1);  
        s1.display();  
        s2.display();  
       }  
    }  