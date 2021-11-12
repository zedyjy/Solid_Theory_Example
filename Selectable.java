package BenzinLitre.Solid_Theory;

/**
 * @ author Zeynep Doga Dellal
 * @ date 2.11.2021
 */

public interface Selectable {
    boolean getSelected();
    void setSelected(boolean a);
    Shape contains(int x, int y);
}
