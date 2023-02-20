import domain.ru.netology.mockito.DescriptionFilms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.mockito.manager.ManagerFilms;

public class ManagerFilmsTest {
    ManagerFilms movie = new ManagerFilms();
    DescriptionFilms film1 = new DescriptionFilms(5, "Вперед", "Мультфильм");
    DescriptionFilms film2 = new DescriptionFilms(7, "Джентльмены", "Боевик");
    DescriptionFilms film3 = new DescriptionFilms(9, "Номер один", "Комедия");
    DescriptionFilms film4 = new DescriptionFilms(11, "Бладшот", "Боевик");
    DescriptionFilms film5 = new DescriptionFilms(13, "Отель Белград", "Комедия");

    @BeforeEach
    public void setup() {
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);
    }

    @Test
    public void shouldAllFilms() {

        DescriptionFilms[] expected = {film1, film2, film3, film4, film5};
        DescriptionFilms[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedAllFilms() {

        DescriptionFilms[] expected = {film5, film4, film3, film2, film1};
        DescriptionFilms[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLimit() {
        ManagerFilms movie = new ManagerFilms(4);

        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);

        DescriptionFilms[] expected = {film5, film4, film3, film2};
        DescriptionFilms[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
