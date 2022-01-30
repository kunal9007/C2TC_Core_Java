    class CPNoCon{  
        int id;  
        String name;  
        CPNoCon(int i,String n){  
        id = i;  
        name = n;  
        }  
        CPNoCon(){}  
        void display(){System.out.println(id+" "+name);}  
       
        public static void main(String args[]){  
        CPNoCon s1 = new CPNoCon(111,"Karan");  
        CPNoCon s2 = new CPNoCon();  
        s2.id=s1.id;  
        s2.name=s1.name;  
        s1.display();  
        s2.display();  
       }  
    }  