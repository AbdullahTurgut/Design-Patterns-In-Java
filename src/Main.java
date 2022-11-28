import memento.Editor;
import memento.History;
import state.Canvas;
import state.EraserTool;
import state.SelectionTool;
import state.abuse.Stopwatch;

public class Main {
    public static void main(String[] args) {
        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();


        //--------IMPLEMENTATION-------------
//        var canvas  =new Canvas();
//        canvas.setCurrentTool(new EraserTool());
//        canvas.mouseDown();
//        canvas.mouseUp();


        //--------UML(Unified Modeling Language)
//        var editor = new Editor();
//        var history = new History();
//        editor.setContent("a"); //content oluşturuldu
//        history.push(editor.createState());//listeye push edildi
//
//        editor.setContent("b");
//        history.push(editor.createState());
//
//        editor.setContent("c");
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());


        //-----POLYMORPHISM----------
//        drawUIControl(new TextBox());
//        drawUIControl(new CheckBox());



        //-------INHERITANCE----------
        //TextBox
        //Button
        //CheckBox
//        var textBox = new TextBox();
//        textBox.enable();
        //enable()
        //focus()
        //setPosition()




        //------ABSTRACTION----------
//        var mailService = new MailService();
//        mailService.sendEmail();

//        // -----ENCAPSULATION EXAMPLE------------------------
//        var account= new Account();
//        account.deposit(15);
//        account.withdraw(7.5f);
//        account.getBalance();




//        TaxCalculator calculator = getCalculator();
//        calculator.calculateTax();

        //User sınıfı için instance
//        User user = new User("Shady",20);
//        user.sayHello();
    }
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2022();
    }
    public static void drawUIControl(UIControl control){
        control.draw();
    }
}