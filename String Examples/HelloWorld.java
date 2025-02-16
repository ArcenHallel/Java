class HelloWorld{
    public static void main(String[] args) {
     String name = "alfredo diaz";
     String country = "Mexico";
     int age = 26;
     String company = "USCG";
     double GPA = 3.5;
     char percentSign = '%';
     boolean amITellingTheTruth = false;
     String formattedString = String.format("Hello World I am %s. I am from %s and I am %d years old. I work for %s. My GPA is %.1f I have attended 100%c of my university classes. these are all %b claims.", name, country, age, company, GPA, percentSign, amITellingTheTruth);

System.out.println(formattedString);
    }
}