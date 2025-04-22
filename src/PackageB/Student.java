package PackageB;

    public class Student {
        //instance variables of the class
        int id;
        String name;
        static int a;

        Student(int i, String n){
            id = i;
            name = n;
        }

        static void addValue(int a){
            a=a;
        }

        void hello(){
            this.id=90;
            this.name="80";
            System.out.println(id); //prints 10
            System.out.println(name);
        }

        public static void main(String[] args) {
//object creation
            Student s = new Student(10,"John");
            addValue(8);
//printing instance variables
            s.hello();
//            System.out.println(s.id); //prints 10
//            System.out.println(s.name); //prints John

        }
    }

