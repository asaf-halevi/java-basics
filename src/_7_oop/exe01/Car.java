package _7_oop.exe01;

/**
 * Define the class �Car�.
 * Add following members:
 * - color
 * - type
 * Add set & get methods for the color & type.
 * Create java program named CarFactory. It should create some cars and change their colors.
 */
public class Car {
    String m_color = null;
    String m_type = null;

    // Color set & get

    String getColor() {
        return m_color;
    }

    void setColor(String color) {
        m_color = color;
    }

    // Type set & get

    String getType() {
        return m_type;
    }

    void setType(String type) {
        m_type = type;
    }
}
