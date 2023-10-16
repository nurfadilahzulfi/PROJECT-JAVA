public class Accecormethod {

    public class InstanceVariabel {
        public class StudentRecord {
            
            private String name;
            private String address;
            private int age;
            private double mathGrade;
            private double englishGrade;
            private double scienceGrade;
            private double average;

            public double getAverage() {
                double result = 0;
                result = (mathGrade+englishGrade+scienceGrade) / 3;

                return result;
            }
        }
    }    
}
