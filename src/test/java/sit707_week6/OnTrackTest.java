package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

import sit707_week10.OnTrack;

import org.junit.Assert;
import org.junit.Test;

public class OnTrackTest {

    @Test
    public void testGetTaskStatus() {
        // Right: Test getting task statuses
        Assert.assertEquals("Not Started", OnTrack.getTaskStatus("task1"));
        Assert.assertEquals("Working On It", OnTrack.getTaskStatus("task2"));
        Assert.assertEquals("Need Help", OnTrack.getTaskStatus("task3"));
        Assert.assertEquals("Ready for Feedback", OnTrack.getTaskStatus("task4"));
        Assert.assertEquals("Not Started", OnTrack.getTaskStatus("unknown_task"));
    }
}
