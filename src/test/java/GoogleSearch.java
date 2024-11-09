import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class GoogleSearch {
    public static void main(String[] args) {

        // Set up WebDriver and Scanner
        WebDriver driver = new ChromeDriver();
        Scanner input = new Scanner(System.in);

        // Prompt user for search term
        System.out.println("Enter search term : ");
        String mySearch = input.nextLine();

        //Open google and perform the search
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys(mySearch);
        driver.findElement(By.name("q")).sendKeys(org.openqa.selenium.Keys.ENTER);

        // Close the input scanner
        input.close();
    }
}
