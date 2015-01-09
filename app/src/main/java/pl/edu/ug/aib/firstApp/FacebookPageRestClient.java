package pl.edu.ug.aib.firstApp;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import pl.edu.ug.aib.firstApp.data.EmailAndPassword;
import pl.edu.ug.aib.firstApp.data.FacebookPage;
import pl.edu.ug.aib.firstApp.data.User;

@Rest(rootUrl = "https://graph.facebook.com",
      converters = { MappingJackson2HttpMessageConverter.class })
public interface FacebookPageRestClient {

    @Get("/{name}")
    FacebookPage getPage(CharSequence name);

    @Post("/user/session")
    User login(EmailAndPassword emailAndPassword);

}