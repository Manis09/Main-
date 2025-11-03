package Variable;

class InstanceBlock{
    int a;
    String name;
    public void defa()
    {
        System.out.println("name is: "+ name +" "+a );
    }

    InstanceBlock(int a,String name){
        this();
        System.out.println("Inside Parameterized constructor");
        this.a=a;
        this.name=name;
    }
    InstanceBlock(){
        System.out.println("Inside constructor");
    }
    {
        System.out.println("Insidde Instance block");
        this.a=10;
        this.name="Manish";
    }
    void printMsg(){
        System.out.println("Name is: "+ name +" "+a);
    }

}
class InstanceBlockApp{
    public static void main(String[] args){
        InstanceBlock ib = new InstanceBlock(11,"Maish");
        ib.printMsg();
        InstanceBlock ib1 = new InstanceBlock();
        ib1.printMsg();

    }
}