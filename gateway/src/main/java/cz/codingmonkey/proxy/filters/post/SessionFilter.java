package cz.codingmonkey.proxy.filters.post;

import com.netflix.util.Pair;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import java.net.HttpCookie;
import java.util.List;
import java.util.Optional;

/**
 * @author Richard Stefanca
 */
public class SessionFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		RequestContext ctx = RequestContext.getCurrentContext();
		return ctx.getRequest().getRequestURL().toString().endsWith("/auth/v1/login");
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();

		ctx.getZuulResponseHeaders().stream()
				.filter(headerTpl -> "Set-Cookie".equals(headerTpl.first()))
				.findFirst()
				.flatMap(pair -> parseCookie(pair.second()))
				.ifPresent(this::saveSessionCookie);


		return null;
	}

	private Optional<Pair<String, String>> parseCookie(String cookieString) {
		List<HttpCookie> cookies = HttpCookie.parse(cookieString);
		return cookies.stream()
				.filter(c -> "JSESSIONID".equals(c.getName()))
				.findFirst()
				.map(c -> new Pair<String, String>(c.getName(), c.getValue()));

	}

	private void saveSessionCookie(Pair<String, String> pair) {
		System.out.println("COOKIE " + pair.first() + " -> " + pair.second());
	}
}
