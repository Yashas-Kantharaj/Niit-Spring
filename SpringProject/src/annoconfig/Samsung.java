package annoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	MobileProcessor cpu;



	public MobileProcessor getCpu() {
		return cpu;
	}

	public void config() {
		System.out.println("octa core-- 8 gb");
		cpu.process();
	}
}
