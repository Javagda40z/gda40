package powtorka2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {

    private Meeting meeting;

    @BeforeEach
    void setUp() {
        meeting = new Meeting("opis", "adres");
    }

    @Test
    void testIfDefaultDateIsNow() {

        LocalDate now = LocalDate.now();
        LocalDate date = meeting.getDate();
        if (now.equals(date)) {
            //test przeszedl
        } else {
            //test nie przeszedl
        }

        assertEquals(LocalDate.now(), meeting.getDate(), "Domyslna data powinna być dzisiejsza!");
//        assertTrue(now.equals(date));
//        assertFalse(!now.equals(date));
    }

    @Test
    void testIfDefaultRoomCapacityIs18() {
        assertEquals(18, meeting.getSize(), "Domyslny rozmiar sali to 18!");
    }


    @Test
    void testWhenDelayingMeetingThenMeetingIsPostponed() {
        meeting.delayMeeting(5);
        assertEquals(LocalDate.now().plusDays(5), meeting.getDate());
    }

    //dodaj test ktory sprawdza czy przy opoznienia spotkania o 0 dni data spotkania sie nie zmienia
}
