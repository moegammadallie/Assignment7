package me.moegammadallie.repository.occupational;

import me.moegammadallie.domain.occupational.OccupationalTherapist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import me.moegammadallie.repository.occupational.OccupationalTherapistRepository;
import me.moegammadallie.repository.occupational.impl.OccupationalTherapistRepositoryImpl;

import java.util.Set;

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
