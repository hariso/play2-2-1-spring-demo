package models;

import play.Logger;
import play.libs.F;
import play.mvc.Http;
import play.mvc.SimpleResult;

public class VerboseAction extends play.mvc.Action.Simple {
	public F.Promise<SimpleResult> call(Http.Context ctx) throws Throwable {
		Logger.info("Calling action for " + ctx);
		return delegate.call(ctx);
	}
}
