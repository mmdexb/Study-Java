public class puppy {
    int puppyAge;
    public puppy (String name){
        System.out.println("the puppy name is: "+name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("the dogs age is "+puppyAge);
        return puppyAge;
    }

    public static void main( String[] args){
        //创建对象
        puppy mypuppy =new puppy("tommy");
        mypuppy.setAge(2);
        mypuppy.getAge();
        System.out.println("var is: "+mypuppy.puppyAge );
    }
}
