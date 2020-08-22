package practice.OOP;

public class Main1 {
    public static void main(String[] args) {
    var textBox1 = new TextBox(); //initialize variable textbox 1 - a new instance of the textbox class. use var to look cleaner and reduce repetition
    //old: TextBox textBox1 = new Textbox(); switched out first "Textbox" to "var"
        textBox1.setText("Box 1 test."); // without this, the next line would be null - would break code if added onto
        System.out.println(textBox1.text.toUpperCase()); //without .text and the set text code above, this would show the memory location only.

    var textBox2 = new TextBox();
    textBox2.setText("Textbox 2 test.");
        System.out.println(textBox2.text.toLowerCase());











    }
}
