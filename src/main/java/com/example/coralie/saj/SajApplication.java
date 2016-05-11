package com.example.coralie.saj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SajApplication {

	public static void main(String[] args) {
		SpringApplication.run(SajApplication.class, args);
	}
  
  	/*@Configuration
	@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
	protected static class SecurityConfiguration extends
			WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.httpBasic()
					.and()
					.authorizeRequests()
					.antMatchers("/index.html", "/template/ticketList.html",
							"/template/login.html", "/template/testList.html",
							"/template/bigestion/contratsList.html",
							"/template/activemq/activemq.html",
							"/template/maquette.html",
							"/template/ui/headerBar.html", "/", "/contrats/**")
					.hasRole("USER").anyRequest().authenticated().and()
					.logout().permitAll().and().anonymous().disable().headers()
					.xssProtection().disable().csrf().disable();

			http.formLogin().failureHandler(new AuthenticationFailureHandler() {

				@Override
				public void onAuthenticationFailure(HttpServletRequest request,
						HttpServletResponse response,
						AuthenticationException exception) throws IOException,
						ServletException {
					LOGGER.debug("Returning UNAUTHORIZED HttpStatus: "
							+ exception.getMessage());
					response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
							"Authentication Failed: " + exception.getMessage());
				}
			});
		}
	}*/
}
