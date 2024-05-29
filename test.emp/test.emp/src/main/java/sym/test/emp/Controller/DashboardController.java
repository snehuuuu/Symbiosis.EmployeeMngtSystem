package sym.test.emp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	@GetMapping("/getDashboard")
	public String getYourDash() {
		return "dashboard";
	}
}
