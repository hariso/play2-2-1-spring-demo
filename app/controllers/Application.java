package controllers;

import models.Foo;
import models.VerboseAction;

import org.springframework.beans.factory.annotation.Autowired;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import services.HelloService;

@org.springframework.stereotype.Controller
public class Application extends Controller {

	@Autowired
	private HelloService helloService;

	@With(VerboseAction.class)
	public Result index() {
		return ok(views.html.index.render(helloService.hello()));
	}

	@Foo
	public Result test() {
		return ok(views.html.index.render(helloService.hello()));
	}

}