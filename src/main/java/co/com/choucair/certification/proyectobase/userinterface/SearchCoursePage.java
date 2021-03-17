package co.com.choucair.certification.proyectobase.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona cursos y certificaciones")
            .located(By.xpath("//*[@id=\"certificaciones\"]/a/img"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.xpath("//input[@id = 'coursesearchbox']"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//div[@class='result']//a[contains(text(), 'Metodología Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extraer el nombre del cusro")
            .located(By.xpath("//h1[contains(text(),'Metodología Bancolombia')]"));
}
