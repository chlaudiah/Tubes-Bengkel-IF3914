/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sparepart.bengkel.kelompokbengkel14.test.Login;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author BegalPapua
 */
@RunWith (Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber","json:target/cucumber.json" })
public class LoginTest {
    
}
