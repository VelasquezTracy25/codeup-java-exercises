package Practice.OOP;

//syncs to Main1

public class TextBox {
public String text = ""; // by setting this to default empty string, the result when called will never be null

public void setText(String text){
this.text = text;
}

public void clear() {
text = "";
}

}
