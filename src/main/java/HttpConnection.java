import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpConnection {

    public static void connectionJSon() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.gov.uk/bank-holidays.json"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject obj = new JSONObject(response.body());
        JSONObject englandAndWales = obj.getJSONObject("england-and-wales");
        JSONArray englandAndWalesHolidays = englandAndWales.getJSONArray("events");
        System.out.println("These are public holidays in England and Wales:");
        for(int i = 0; i < englandAndWalesHolidays.length(); i++)
        {
            JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
            System.out.println(holiday.getString("title") + " on " + holiday.getString("date"));
        }

        //Starting point for application in JOptionPane

        String message = "Choose a month to get information about holidays in the UK!";
        String title = "Hello";
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String input = (String) JOptionPane.showInputDialog(null, "",
                "Choose a month", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                months, // Array of choices
                months[1]); // Initial choice
        System.out.println(input);

        if (input.equalsIgnoreCase("January")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-01")) {
                    JOptionPane.showMessageDialog(null, "Holiday in January: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in January.", "Information", JOptionPane.OK_OPTION);
            }
        }

        if (input.equalsIgnoreCase("February")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-02")) {
                    JOptionPane.showMessageDialog(null, "Holiday in February: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in February.", "Information", JOptionPane.OK_OPTION);
            }
        }

        if (input.equalsIgnoreCase("March")) {
            boolean foundMarchHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-03")) {
                    JOptionPane.showMessageDialog(null, "Holiday in March: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.OK_OPTION);
                    foundMarchHoliday = true;
                    break;
                }
            }
            if (!foundMarchHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in March.", "Information", JOptionPane.OK_OPTION);
            }

        }

        if (input.equalsIgnoreCase("April")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-04")) {
                    JOptionPane.showMessageDialog(null, "Holiday in April: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in April.", "Information", JOptionPane.OK_OPTION);
            }

        }

        if (input.equalsIgnoreCase("May")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-05")) {
                    JOptionPane.showMessageDialog(null, "Holiday in May: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in May.", "Information", JOptionPane.OK_OPTION);
            }

        }

        if (input.equalsIgnoreCase("June")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-06")) {
                    JOptionPane.showMessageDialog(null, "Holiday in June: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in June.", "Information", JOptionPane.OK_OPTION);
            }
        }

        if (input.equalsIgnoreCase("July")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-07")) {
                    JOptionPane.showMessageDialog(null, "Holiday in July: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in July.", "Information", JOptionPane.OK_OPTION);
            }
        }

        if (input.equalsIgnoreCase("August")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-08")) {
                    JOptionPane.showMessageDialog(null, "Holiday in August: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in August.", "Information", JOptionPane.OK_OPTION);
            }
        }

        if (input.equalsIgnoreCase("September")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-09")) {
                    JOptionPane.showMessageDialog(null, "Holiday in September: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in September.", "Information", JOptionPane.OK_OPTION);
            }
        }

        if (input.equalsIgnoreCase("October")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-10")) {
                    JOptionPane.showMessageDialog(null, "Holiday in October: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in October.", "Information", JOptionPane.OK_OPTION);
            }
        }

        if (input.equalsIgnoreCase("November")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-11")) {
                    JOptionPane.showMessageDialog(null, "Holiday in November: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in November.", "Information", JOptionPane.OK_OPTION);
            }
        }

        if (input.equalsIgnoreCase("December")) {
            boolean foundAprilHoliday = false;
            for (int i = 0; i < englandAndWalesHolidays.length(); i++) {
                JSONObject holiday = englandAndWalesHolidays.getJSONObject(i);
                String date = holiday.getString("date");
                if (date.startsWith("2023-12")) {
                    JOptionPane.showMessageDialog(null, "Holiday in December: " + holiday.getString("title") + " on " + date, "Information", JOptionPane.INFORMATION_MESSAGE);
                    foundAprilHoliday = true;
                    break;
                }
            }
            if (!foundAprilHoliday) {
                JOptionPane.showMessageDialog(null, "No holidays in December.", "Information", JOptionPane.OK_OPTION);
            }
        }
    }
}
