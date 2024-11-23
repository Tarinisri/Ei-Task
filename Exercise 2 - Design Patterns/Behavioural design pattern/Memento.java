//TextEditorState stores the editor’s state (content).
//TextEditor can write content, save its state, or restore it.
//The client can save the current state and restore it later.


// Memento
class TextEditorState {
    private String content;

    public TextEditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Originator
class TextEditor {
    private String content;

    public void write(String content) {
        this.content = content;
    }

    public TextEditorState save() {
        return new TextEditorState(content);
    }

    public void restore(TextEditorState state) {
        content = state.getContent();
    }

    public void showContent() {
        System.out.println("Content: " + content);
    }
}

// Client
public class Memento {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.write("Version 1");
        TextEditorState saved = editor.save();

        editor.write("Version 2");
        editor.showContent();

        editor.restore(saved);
        editor.showContent();
    }
}
