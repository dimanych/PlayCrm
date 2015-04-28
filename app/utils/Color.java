package utils;

/**
 * <p>Цвета</p>
 *
 * @author Dmitriy Grigoriev
 */
public class Color {
  public enum  Light {
    BLUE   ("#428bca"),
    GREEN  ("#5cb85c"),
    PURPLE ("#624d69"),
    RED    ("#d9534f"),
    YELLOW ("#ffd700");

    private final String color;
    
    Light(String color) {
      this.color = color;
    }

    public String hex(){
      return color;
    }
  }

  public enum  Normal {
    BLUE   ("#5bc0de"),
    GREEN  ("#7fc77f"),
    PURPLE ("#7b5f85"),
    RED    ("#e07d79"),
    YELLOW ("#ffe033");

    private final String color;

    Normal(String color) {
      this.color = color;
    }

    public String hex(){
      return color;
    }
  }

}
