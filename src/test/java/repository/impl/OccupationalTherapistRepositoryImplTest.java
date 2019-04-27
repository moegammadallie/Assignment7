package repository.impl;

import domain.actors.OccupationalTherapist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.OccupationalTherapistRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class OccupationalTherapistRepositoryImplTest {

    private OccupationalTherapistRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = OccupationalTherapistRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<OccupationalTherapist> occupationalTherapists = this.repository.getAll();
        Assert.assertEquals(1, occupationalTherapists.size());
    }

    @Test
    public void create() {
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}