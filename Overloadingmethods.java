public class Overloadingmethods {
    public class StudentRecord {
            
        private String name;
        private String address;
        private int age;
        private double mathGrade;
        private double englishGrade;
        private double scienceGrade;
        private double average;

        public String getName(){ 
            return name; 
            }

        public void setName( String temp ){ 
        name = temp; 
        }
        
        public void print(String temp) {
            System.out.println("Name :" + name);
            System.out.println("Address :" + address);
            System.out.println("Age : " + age);
        }

        public void print(double englishGrade, double mathGrade, double scienceGrade) {
            System.out.println("Name : "+  name);
            System.out.println("Math Grade : " + mathGrade);
            System.out.println("English Grade : " + englishGrade);
            System.out.println("Science Grade : " + scienceGrade);
        }
    }
    
}
