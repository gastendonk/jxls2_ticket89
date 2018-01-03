package jxls2.ticket89;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

/**
 * https://bitbucket.org/leonate/jxls/issues/89/conditional-formattings-are-not-copied
 */
public class Ticket89 {

	public static void main(String[] args) throws IOException {
		try (InputStream is = Files.newInputStream(Paths.get("ticket89.xlsx"))) {
			try (OutputStream os = new FileOutputStream("ticket89-output.xlsx")) {
				Context context = new Context();
				context.putVar("persons", getPersons());
				JxlsHelper.getInstance().processTemplate(is, os, context);
				System.out.println("done");
			}
		}
	}

	private static List<Person> getPersons() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Gerd"));
		persons.add(new Person("Gerda"));
		persons.add(new Person("Otto"));
		persons.add(new Person("Werner"));
		persons.add(new Person("Harry"));
		persons.add(new Person("Clotilde"));
		persons.add(new Person("Dagmar"));
		persons.add(new Person("Sibille"));
		persons.add(new Person("Michael"));
		persons.add(new Person("Johnny"));
		return persons;
	}
}
