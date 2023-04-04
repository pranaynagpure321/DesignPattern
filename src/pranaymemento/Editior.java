package pranaymemento;

public class Editior {

    public String content;

    public EdittorState createState()
    {
        return  new EdittorState(content);
    }

    public  void  restore(EdittorState state){
        content = state.getContent();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
