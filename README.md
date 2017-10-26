<p align="center">
  <img src="https://pac4j.github.io/pac4j/img/logo-j2e.png" width="300" />
</p>

This `j2e-pac4j-cdi-demo` project is a JavaEE web application to test the [j2e-pac4j](https://github.com/pac4j/j2e-pac4j) security library with various authentication mechanisms: Facebook, Twitter, form, basic auth, CAS, SAML, OpenID Connect, JWT...

## Start and test

Build the project and launch the web app via the [Payara Server](http://www.payara.fish/) on [http://localhost:8080](http://localhost:8080)
   with either the payara-micro maven plugin or embedded-payara plugin:

    cd j2-pac4j-cdi-demo
    mvn clean package payara-micro:start
    
OR

    cd j2-pac4j-cdi-demo
    mvn clean package embedded-payara:run

To test, you can call a protected URL by clicking on the "Protected url by **xxx**" link, which will start the authentication process with the **xxx** provider.

This utilizes org.pac4j.http.credentials.authenticator.test.SimpleTestUsernamePasswordAuthenticator.java where the submitted username needs to match the submitted password.
