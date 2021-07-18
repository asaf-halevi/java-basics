package _7_oop.exe07;

/**
 * Write a class that represents a word.
 * Add constructors.
 * Add set & get methods.
 * Add the following methods:
 * print() � will print the word.
 * print (boolean spell):
 * spell=true: will print a letter in a line.
 * spell=false: will print the entire word (like first method).
 * <p>
 * Add a main code that uses the class.
 *
 * @author Tal Green
 */
public class Word {
    private String m_word = null;

    // Constructors
    public Word() {
        m_word = "";
    }

    public Word(String word) {
        m_word = word;
    }

    // Getter & Setter
    public String getWord() {
        return m_word;
    }

    public void setWord(String word) {
        m_word = word;
    }

    // Methods
    public void print() {
        System.out.println(m_word);
    }

    public void print(boolean spell) {
        if (!spell) {
            print();
        } else {
            for (int i = 0; i < m_word.length(); i++) {
                System.out.println(m_word.charAt(i));
            }
        }
    }

}
