import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test001");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.DESIGNER;
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.DESIGNER + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.DESIGNER));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        edu.ksu.canvas.errors.UserErrorHandler userErrorHandler0 = new edu.ksu.canvas.errors.UserErrorHandler();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType importType2 = null;
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.requestOptions.CreateSisImportOptions createSisImportOptions6 = new edu.ksu.canvas.requestOptions.CreateSisImportOptions("hi!", "hi!", importType2, "", inputStream4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        edu.ksu.canvas.requestOptions.UnEnrollOptions unEnrollOptions0 = edu.ksu.canvas.requestOptions.UnEnrollOptions.CONCLUDE;
        org.junit.Assert.assertTrue("'" + unEnrollOptions0 + "' != '" + edu.ksu.canvas.requestOptions.UnEnrollOptions.CONCLUDE + "'", unEnrollOptions0.equals(edu.ksu.canvas.requestOptions.UnEnrollOptions.CONCLUDE));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include include0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.SYLLABUS_BODY;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.SYLLABUS_BODY + "'", include0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.SYLLABUS_BODY));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        edu.ksu.canvas.requestOptions.CreateConversationOptions.Mode mode0 = edu.ksu.canvas.requestOptions.CreateConversationOptions.Mode.SYNC;
        org.junit.Assert.assertTrue("'" + mode0 + "' != '" + edu.ksu.canvas.requestOptions.CreateConversationOptions.Mode.SYNC + "'", mode0.equals(edu.ksu.canvas.requestOptions.CreateConversationOptions.Mode.SYNC));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.TA;
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.TA + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.TA));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        edu.ksu.canvas.model.CalendarEvent.Frequency frequency0 = edu.ksu.canvas.model.CalendarEvent.Frequency.MONTHLY;
        org.junit.Assert.assertTrue("'" + frequency0 + "' != '" + edu.ksu.canvas.model.CalendarEvent.Frequency.MONTHLY + "'", frequency0.equals(edu.ksu.canvas.model.CalendarEvent.Frequency.MONTHLY));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        long long0 = edu.ksu.canvas.model.sisimport.SisImportErrorsAttachment.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.SECTIONS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.SECTIONS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.SECTIONS));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include include0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.TOTAL_STUDENTS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.TOTAL_STUDENTS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.TOTAL_STUDENTS));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.google.gson.Gson gson1 = edu.ksu.canvas.impl.GsonResponseParser.getDefaultGsonParser((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(gson1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.TEACHER;
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.TEACHER + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.TEACHER));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State state0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.UNPUBLISHED;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.UNPUBLISHED + "'", state0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.UNPUBLISHED));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        edu.ksu.canvas.requestOptions.CreateConversationOptions.Mode mode0 = edu.ksu.canvas.requestOptions.CreateConversationOptions.Mode.ASYNC;
        org.junit.Assert.assertTrue("'" + mode0 + "' != '" + edu.ksu.canvas.requestOptions.CreateConversationOptions.Mode.ASYNC + "'", mode0.equals(edu.ksu.canvas.requestOptions.CreateConversationOptions.Mode.ASYNC));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        edu.ksu.canvas.requestOptions.DeleteCalendarEventOptions deleteCalendarEventOptions1 = new edu.ksu.canvas.requestOptions.DeleteCalendarEventOptions((java.lang.Integer) 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.ContentMigration> contentMigrationList10 = contentMigrationImpl8.getGroupContentMigrations("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.CourseSettings>> courseSettingsListConsumer9 = null;
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader10 = courseSettingsImpl8.withCallback(courseSettingsListConsumer9);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.CourseSettings>> courseSettingsListConsumer11 = null;
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader12 = courseSettingsReader10.withCallback(courseSettingsListConsumer11);
        org.junit.Assert.assertNotNull(courseSettingsReader10);
        org.junit.Assert.assertNotNull(courseSettingsReader12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.ACCOUNT;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.ACCOUNT + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.ACCOUNT));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        edu.ksu.canvas.requestOptions.DeleteCourseOptions.EventType eventType0 = edu.ksu.canvas.requestOptions.DeleteCourseOptions.EventType.CONCLUDE;
        java.lang.String str1 = eventType0.toString();
        org.junit.Assert.assertTrue("'" + eventType0 + "' != '" + edu.ksu.canvas.requestOptions.DeleteCourseOptions.EventType.CONCLUDE + "'", eventType0.equals(edu.ksu.canvas.requestOptions.DeleteCourseOptions.EventType.CONCLUDE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "conclude" + "'", str1, "conclude");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional11 = contentMigrationImpl8.getAccountContentMigration("", (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED + "'", include0.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        edu.ksu.canvas.requestOptions.GetUsersInAccountOptions.Include include0 = edu.ksu.canvas.requestOptions.GetUsersInAccountOptions.Include.email;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInAccountOptions.Include.email + "'", include0.equals(edu.ksu.canvas.requestOptions.GetUsersInAccountOptions.Include.email));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentState enrollmentState0 = edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentState.DELETED;
        org.junit.Assert.assertTrue("'" + enrollmentState0 + "' != '" + edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentState.DELETED + "'", enrollmentState0.equals(edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentState.DELETED));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.requestOptions.DeleteAssignmentGroupOptions deleteAssignmentGroupOptions2 = new edu.ksu.canvas.requestOptions.DeleteAssignmentGroupOptions("", (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Course ID and assignment group ID must be specified");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        edu.ksu.canvas.requestOptions.GetUsersInAccountOptions.Include include0 = edu.ksu.canvas.requestOptions.GetUsersInAccountOptions.Include.time_zone;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInAccountOptions.Include.time_zone + "'", include0.equals(edu.ksu.canvas.requestOptions.GetUsersInAccountOptions.Include.time_zone));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        edu.ksu.canvas.model.assignment.GradingRules gradingRules0 = new edu.ksu.canvas.model.assignment.GradingRules();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        long long0 = edu.ksu.canvas.model.status.Delete.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        edu.ksu.canvas.net.RestClient restClient2 = null;
        edu.ksu.canvas.impl.RestCanvasMessenger restCanvasMessenger3 = new edu.ksu.canvas.impl.RestCanvasMessenger(10, (int) (byte) 0, restClient2);
        edu.ksu.canvas.oauth.OauthToken oauthToken4 = null;
        com.google.gson.JsonObject jsonObject6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.net.Response response7 = restCanvasMessenger3.sendJsonPutToCanvas(oauthToken4, "", jsonObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.model.assignment.Assignment.ExternalToolTagAttribute externalToolTagAttribute1 = assignment0.new ExternalToolTagAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to edu.ksu.canvas.model.assignment.Assignment$ExternalToolTagAttribute with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        edu.ksu.canvas.requestOptions.UpdateCoursesOptions.EventType eventType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.requestOptions.UpdateCoursesOptions updateCoursesOptions1 = new edu.ksu.canvas.requestOptions.UpdateCoursesOptions(eventType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include include0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.COURSE_PROGRESS;
        java.lang.String str1 = include0.toString();
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.COURSE_PROGRESS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.COURSE_PROGRESS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "course_progress" + "'", str1, "course_progress");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl8 = new edu.ksu.canvas.impl.AssignmentImpl("", (java.lang.Integer) 1, oauthToken2, restClient3, (int) ' ', (int) (short) -1, (java.lang.Integer) 100, (java.lang.Boolean) false);
        edu.ksu.canvas.requestOptions.ListUserAssignmentOptions listUserAssignmentOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.assignment.Assignment> assignmentList10 = assignmentImpl8.listUserAssignments(listUserAssignmentOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional11 = contentMigrationImpl8.getGroupContentMigration("course_progress", (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        edu.ksu.canvas.exception.InvalidOauthTokenException invalidOauthTokenException0 = new edu.ksu.canvas.exception.InvalidOauthTokenException();
        edu.ksu.canvas.exception.InvalidOauthTokenException invalidOauthTokenException1 = new edu.ksu.canvas.exception.InvalidOauthTokenException();
        invalidOauthTokenException0.addSuppressed((java.lang.Throwable) invalidOauthTokenException1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentState enrollmentState0 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentState.COMPLETED;
        org.junit.Assert.assertTrue("'" + enrollmentState0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentState.COMPLETED + "'", enrollmentState0.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentState.COMPLETED));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        edu.ksu.canvas.model.CommunicationChannel.Type type0 = edu.ksu.canvas.model.CommunicationChannel.Type.TWITTER;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + edu.ksu.canvas.model.CommunicationChannel.Type.TWITTER + "'", type0.equals(edu.ksu.canvas.model.CommunicationChannel.Type.TWITTER));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TERM;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TERM + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TERM));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        edu.ksu.canvas.requestOptions.GetSubAccountsOptions getSubAccountsOptions1 = new edu.ksu.canvas.requestOptions.GetSubAccountsOptions("conclude");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State state0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.COMPLETED;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.COMPLETED + "'", state0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.COMPLETED));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.google.gson.Gson gson1 = edu.ksu.canvas.impl.GsonResponseParser.getDefaultGsonParser((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(gson1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State state0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.DELETED;
        java.lang.String str1 = state0.toString();
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.DELETED + "'", state0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.DELETED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "deleted" + "'", str1, "deleted");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include include0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.TEACHERS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.TEACHERS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.Include.TEACHERS));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.SelectiveDataImpl selectiveDataImpl8 = new edu.ksu.canvas.impl.SelectiveDataImpl("", (java.lang.Integer) 10, oauthToken2, restClient3, 1, 100, (java.lang.Integer) 1, (java.lang.Boolean) true);
        edu.ksu.canvas.requestOptions.GetSelectiveDataOptions getSelectiveDataOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.SelectiveData> selectiveDataList10 = selectiveDataImpl8.getGroupSelectiveDataFromMigration(getSelectiveDataOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.LICENSE;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.LICENSE + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.LICENSE));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        long long0 = edu.ksu.canvas.model.Account.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.model.assignment.Assignment.NeedsGradingCount needsGradingCount1 = assignment0.new NeedsGradingCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to edu.ksu.canvas.model.assignment.Assignment$NeedsGradingCount with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup0 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.lang.Integer int1 = assignmentGroup0.getPosition();
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        edu.ksu.canvas.requestOptions.GetSingleConversationOptions.FilterMode filterMode0 = edu.ksu.canvas.requestOptions.GetSingleConversationOptions.FilterMode.OR;
        org.junit.Assert.assertTrue("'" + filterMode0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleConversationOptions.FilterMode.OR + "'", filterMode0.equals(edu.ksu.canvas.requestOptions.GetSingleConversationOptions.FilterMode.OR));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType importType2 = null;
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.requestOptions.CreateSisImportOptions createSisImportOptions5 = new edu.ksu.canvas.requestOptions.CreateSisImportOptions("hi!", "course_progress", importType2, "hi!", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions2 = new edu.ksu.canvas.requestOptions.CreateConversationOptions("", "course_progress");
        edu.ksu.canvas.requestOptions.CreateConversationOptions.MediaCommentType mediaCommentType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions4 = createConversationOptions2.mediaCommentType(mediaCommentType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.OBSERVED_USERS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.OBSERVED_USERS + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.OBSERVED_USERS));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        edu.ksu.canvas.requestOptions.GetSubAccountsOptions getSubAccountsOptions1 = new edu.ksu.canvas.requestOptions.GetSubAccountsOptions("deleted");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("course_progress", (java.lang.Integer) 1, oauthToken2, restClient3, (int) (byte) -1, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.MigrationIssue> migrationIssueList11 = migrationIssueImpl8.getAccountMigrationIssues("conclude", (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.CourseSettings>> courseSettingsListConsumer9 = null;
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader10 = courseSettingsImpl8.withCallback(courseSettingsListConsumer9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.CourseSettings> courseSettingsOptional12 = courseSettingsReader10.getCourseSettings("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSettingsReader10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        edu.ksu.canvas.model.GradingStandard gradingStandard0 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.model.GradingStandard.GradingSchemeEntry gradingSchemeEntry1 = gradingStandard0.new GradingSchemeEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to edu.ksu.canvas.model.GradingStandard$GradingSchemeEntry with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        edu.ksu.canvas.model.CommunicationChannel.WorkflowState workflowState0 = edu.ksu.canvas.model.CommunicationChannel.WorkflowState.UNCONFIRMED;
        org.junit.Assert.assertTrue("'" + workflowState0 + "' != '" + edu.ksu.canvas.model.CommunicationChannel.WorkflowState.UNCONFIRMED + "'", workflowState0.equals(edu.ksu.canvas.model.CommunicationChannel.WorkflowState.UNCONFIRMED));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        edu.ksu.canvas.model.AuthenticationLog.EventType eventType0 = edu.ksu.canvas.model.AuthenticationLog.EventType.login;
        org.junit.Assert.assertTrue("'" + eventType0 + "' != '" + edu.ksu.canvas.model.AuthenticationLog.EventType.login + "'", eventType0.equals(edu.ksu.canvas.model.AuthenticationLog.EventType.login));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        edu.ksu.canvas.requestOptions.ListAssignmentGroupOptions.ExcludeSubmissionTypes excludeSubmissionTypes0 = edu.ksu.canvas.requestOptions.ListAssignmentGroupOptions.ExcludeSubmissionTypes.EXTERNAL_TOOL;
        org.junit.Assert.assertTrue("'" + excludeSubmissionTypes0 + "' != '" + edu.ksu.canvas.requestOptions.ListAssignmentGroupOptions.ExcludeSubmissionTypes.EXTERNAL_TOOL + "'", excludeSubmissionTypes0.equals(edu.ksu.canvas.requestOptions.ListAssignmentGroupOptions.ExcludeSubmissionTypes.EXTERNAL_TOOL));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.ContentMigration> contentMigrationList10 = contentMigrationImpl8.getUserContentMigrations("conclude");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.QuizImpl quizImpl8 = new edu.ksu.canvas.impl.QuizImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 10, 100, (java.lang.Integer) 10, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.QuizWriter quizWriter10 = quizImpl8.writeAsCanvasUser("");
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.assignment.Quiz>> quizListConsumer11 = null;
        edu.ksu.canvas.interfaces.QuizReader quizReader12 = quizImpl8.withCallback(quizListConsumer11);
        org.junit.Assert.assertNotNull(quizWriter10);
        org.junit.Assert.assertNotNull(quizReader12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        edu.ksu.canvas.model.EnrollmentTerm enrollmentTerm0 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.model.EnrollmentTerm.EnrollmentTermOverride enrollmentTermOverride1 = enrollmentTerm0.new EnrollmentTermOverride();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to edu.ksu.canvas.model.EnrollmentTerm$EnrollmentTermOverride with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State state0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.CREATED;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.CREATED + "'", state0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.CREATED));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.STORAGE_QUOTA_USED_MB;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.STORAGE_QUOTA_USED_MB + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.STORAGE_QUOTA_USED_MB));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.EMAIL;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.EMAIL + "'", include0.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.EMAIL));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.State state0 = edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.State.AVAILABLE;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.State.AVAILABLE + "'", state0.equals(edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.State.AVAILABLE));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.requestOptions.CreateCourseContentMigrationOptions createCourseContentMigrationOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional11 = contentMigrationImpl8.updateCourseContentMigration((java.lang.Integer) (-1), createCourseContentMigrationOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        edu.ksu.canvas.requestOptions.StartQuizSubmissionOptions startQuizSubmissionOptions2 = new edu.ksu.canvas.requestOptions.StartQuizSubmissionOptions("", (java.lang.Integer) 0);
        edu.ksu.canvas.requestOptions.StartQuizSubmissionOptions startQuizSubmissionOptions4 = startQuizSubmissionOptions2.preview((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(startQuizSubmissionOptions4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        long long0 = edu.ksu.canvas.model.CalendarEvent.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket bucket0 = edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.UPCOMING;
        org.junit.Assert.assertTrue("'" + bucket0 + "' != '" + edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.UPCOMING + "'", bucket0.equals(edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.UPCOMING));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        edu.ksu.canvas.enums.SectionIncludes sectionIncludes0 = edu.ksu.canvas.enums.SectionIncludes.STUDENTS;
        org.junit.Assert.assertTrue("'" + sectionIncludes0 + "' != '" + edu.ksu.canvas.enums.SectionIncludes.STUDENTS + "'", sectionIncludes0.equals(edu.ksu.canvas.enums.SectionIncludes.STUDENTS));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Include include0 = edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Include.ALL_DATES;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Include.ALL_DATES + "'", include0.equals(edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Include.ALL_DATES));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional11 = contentMigrationImpl8.getAccountContentMigration("", (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("course_progress", (java.lang.Integer) 1, oauthToken2, restClient3, (int) (byte) -1, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.MigrationIssue> migrationIssueOptional12 = migrationIssueImpl8.getAccountMigrationIssue("", (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AccountImpl accountImpl8 = new edu.ksu.canvas.impl.AccountImpl("conclude/api/v1/course_progress", (java.lang.Integer) 100, oauthToken2, restClient3, 100, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Boolean) true);
        edu.ksu.canvas.model.Account account10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.Account> accountOptional11 = accountImpl8.createAccount("conclude/api/v1/course_progress", account10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include include0 = edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.OBSERVED_USERS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.OBSERVED_USERS + "'", include0.equals(edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.OBSERVED_USERS));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        edu.ksu.canvas.model.Conversation.ConversationMessageState conversationMessageState0 = edu.ksu.canvas.model.Conversation.ConversationMessageState.unread;
        org.junit.Assert.assertTrue("'" + conversationMessageState0 + "' != '" + edu.ksu.canvas.model.Conversation.ConversationMessageState.unread + "'", conversationMessageState0.equals(edu.ksu.canvas.model.Conversation.ConversationMessageState.unread));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("", (java.lang.Integer) (-1), oauthToken2, restClient3, (int) (short) 1, (int) '#', (java.lang.Integer) 0, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.MigrationIssue> migrationIssueList11 = migrationIssueImpl8.getAccountMigrationIssues("deleted", (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.QuizImpl quizImpl8 = new edu.ksu.canvas.impl.QuizImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 10, 100, (java.lang.Integer) 10, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.assignment.Quiz> quizList10 = quizImpl8.getQuizzesInCourse("conclude");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AccountReportImpl accountReportImpl8 = new edu.ksu.canvas.impl.AccountReportImpl("", (java.lang.Integer) 10, oauthToken2, restClient3, (int) (byte) -1, (int) (short) 10, (java.lang.Integer) (-1), (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.report.AccountReport> accountReportOptional12 = accountReportImpl8.deleteReport("", "", (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        edu.ksu.canvas.model.AccountAdmin accountAdmin0 = new edu.ksu.canvas.model.AccountAdmin();
        java.lang.Integer int1 = accountAdmin0.getRoleId();
        edu.ksu.canvas.model.User user2 = null;
        accountAdmin0.setUser(user2);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("course_progress", (java.lang.Integer) 1, oauthToken2, restClient3, (int) (byte) -1, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.MigrationIssue> migrationIssueOptional12 = migrationIssueImpl8.getUserMigrationIssue("conclude", (java.lang.Integer) (-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader10 = courseSettingsImpl8.readAsSisUser("");
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter12 = courseSettingsImpl8.writeAsSisUser("deleted");
        org.junit.Assert.assertNotNull(courseSettingsReader10);
        org.junit.Assert.assertNotNull(courseSettingsWriter12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.QuizImpl quizImpl8 = new edu.ksu.canvas.impl.QuizImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 10, 100, (java.lang.Integer) 10, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.QuizReader quizReader10 = quizImpl8.readAsSisUser("hi!");
        edu.ksu.canvas.interfaces.QuizWriter quizWriter12 = quizImpl8.writeAsSisUser("course_progress");
        org.junit.Assert.assertNotNull(quizReader10);
        org.junit.Assert.assertNotNull(quizWriter12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("", (java.lang.Integer) (-1), oauthToken2, restClient3, (int) (short) 1, (int) '#', (java.lang.Integer) 0, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.MigrationIssueReader migrationIssueReader10 = migrationIssueImpl8.readAsCanvasUser("deleted");
        org.junit.Assert.assertNotNull(migrationIssueReader10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket bucket0 = edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.FUTURE;
        org.junit.Assert.assertTrue("'" + bucket0 + "' != '" + edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.FUTURE + "'", bucket0.equals(edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.FUTURE));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl8 = new edu.ksu.canvas.impl.AssignmentImpl("", (java.lang.Integer) 1, oauthToken2, restClient3, (int) ' ', (int) (short) -1, (java.lang.Integer) 100, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.AssignmentReader assignmentReader10 = assignmentImpl8.readAsSisUser("course_progress");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions listCourseAssignmentsOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.assignment.Assignment> assignmentList12 = assignmentImpl8.listCourseAssignments(listCourseAssignmentsOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(assignmentReader10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES;
        java.lang.String str1 = include0.toString();
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES + "'", include0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "total_scores" + "'", str1, "total_scores");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setEnrollmentTermId((long) (byte) 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        edu.ksu.canvas.requestOptions.UnEnrollOptions unEnrollOptions0 = edu.ksu.canvas.requestOptions.UnEnrollOptions.DELETE;
        org.junit.Assert.assertTrue("'" + unEnrollOptions0 + "' != '" + edu.ksu.canvas.requestOptions.UnEnrollOptions.DELETE + "'", unEnrollOptions0.equals(edu.ksu.canvas.requestOptions.UnEnrollOptions.DELETE));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State state0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.COMPLETED;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.COMPLETED + "'", state0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.State.COMPLETED));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.CONCLUDED;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.CONCLUDED + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.CONCLUDED));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        edu.ksu.canvas.model.UserDisplay userDisplay0 = new edu.ksu.canvas.model.UserDisplay();
        userDisplay0.setDisplayName("deleted");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        edu.ksu.canvas.requestOptions.DeleteAssignmentGroupOptions deleteAssignmentGroupOptions2 = new edu.ksu.canvas.requestOptions.DeleteAssignmentGroupOptions("conclude/api/v1/course_progress", (java.lang.Integer) 10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.requestOptions.CreateCourseContentMigrationOptions createCourseContentMigrationOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional11 = contentMigrationImpl8.updateCourseContentMigration((java.lang.Integer) 1, createCourseContentMigrationOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("", (java.lang.Integer) (-1), oauthToken2, restClient3, (int) (short) 1, (int) '#', (java.lang.Integer) 0, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.MigrationIssue> migrationIssueList11 = migrationIssueImpl8.getCourseMigrationIssues("conclude/api/v1/course_progress", (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.SelectiveDataImpl selectiveDataImpl8 = new edu.ksu.canvas.impl.SelectiveDataImpl("", (java.lang.Integer) 10, oauthToken2, restClient3, 1, 100, (java.lang.Integer) 1, (java.lang.Boolean) true);
        edu.ksu.canvas.requestOptions.GetSelectiveDataOptions getSelectiveDataOptions12 = new edu.ksu.canvas.requestOptions.GetSelectiveDataOptions("conclude", (java.lang.Integer) 10, "course_progress");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.SelectiveData> selectiveDataList13 = selectiveDataImpl8.getUserSelectiveDataFromMigration(getSelectiveDataOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader10 = courseSettingsImpl8.readAsCanvasUser("");
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter12 = courseSettingsImpl8.writeAsCanvasUser("conclude");
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter14 = courseSettingsWriter12.writeAsSisUser("conclude/api/v1/course_progress");
        org.junit.Assert.assertNotNull(courseSettingsReader10);
        org.junit.Assert.assertNotNull(courseSettingsWriter12);
        org.junit.Assert.assertNotNull(courseSettingsWriter14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        long long0 = edu.ksu.canvas.model.MigrationIssue.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.SelectiveDataImpl selectiveDataImpl8 = new edu.ksu.canvas.impl.SelectiveDataImpl("", (java.lang.Integer) 10, oauthToken2, restClient3, 1, 100, (java.lang.Integer) 1, (java.lang.Boolean) true);
        edu.ksu.canvas.requestOptions.GetSelectiveDataOptions getSelectiveDataOptions12 = new edu.ksu.canvas.requestOptions.GetSelectiveDataOptions("conclude", (java.lang.Integer) 10, "course_progress");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.SelectiveData> selectiveDataList13 = selectiveDataImpl8.getAccountSelectiveDataFromMigration(getSelectiveDataOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        edu.ksu.canvas.errors.GenericErrorResponse genericErrorResponse0 = new edu.ksu.canvas.errors.GenericErrorResponse();
        java.util.Map<java.lang.String, java.util.List<edu.ksu.canvas.errors.ErrorDetails>> strMap1 = genericErrorResponse0.getErrors();
        org.junit.Assert.assertNull(strMap1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        edu.ksu.canvas.errors.GenericErrorHandler genericErrorHandler0 = new edu.ksu.canvas.errors.GenericErrorHandler();
        org.apache.http.HttpRequest httpRequest1 = null;
        org.apache.http.HttpResponse httpResponse2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = genericErrorHandler0.shouldHandle(httpRequest1, httpResponse2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("course_progress", (java.lang.Integer) 1, oauthToken2, restClient3, (int) (byte) -1, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.MigrationIssue> migrationIssueList11 = migrationIssueImpl8.getAccountMigrationIssues("total_scores", (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.SUBMISSION_HISTORY;
        java.lang.String str1 = include0.toString();
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.SUBMISSION_HISTORY + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.SUBMISSION_HISTORY));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "submission_history" + "'", str1, "submission_history");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ContentMigrationWriter contentMigrationWriter10 = contentMigrationImpl8.writeAsSisUser("");
        edu.ksu.canvas.requestOptions.CreateCourseContentMigrationOptions createCourseContentMigrationOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional12 = contentMigrationImpl8.createCourseContentMigration(createCourseContentMigrationOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentMigrationWriter10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        edu.ksu.canvas.net.RestClient restClient2 = null;
        edu.ksu.canvas.impl.RestCanvasMessenger restCanvasMessenger3 = new edu.ksu.canvas.impl.RestCanvasMessenger(10, (int) (byte) 0, restClient2);
        edu.ksu.canvas.oauth.OauthToken oauthToken4 = null;
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup6 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.lang.String str7 = assignmentGroup6.getSisSourceId();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = assignmentGroup6.toPostMap(false);
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.net.Response response10 = restCanvasMessenger3.deleteFromCanvas(oauthToken4, "conclude/api/v1/course_progress", strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Type type0 = edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Type.ASSIGNMENT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Type.ASSIGNMENT + "'", type0.equals(edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Type.ASSIGNMENT));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = assignment0.isOmitFromFinalGrade();
        assignment0.setDescription("deleted");
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.EnrollmentTermImpl enrollmentTermImpl8 = new edu.ksu.canvas.impl.EnrollmentTermImpl("conclude", (java.lang.Integer) 1, oauthToken2, restClient3, (int) 'a', 1, (java.lang.Integer) 10, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.EnrollmentTermReader enrollmentTermReader10 = enrollmentTermImpl8.readAsCanvasUser("");
        edu.ksu.canvas.interfaces.EnrollmentTermReader enrollmentTermReader12 = enrollmentTermReader10.readAsCanvasUser("conclude");
        org.junit.Assert.assertNotNull(enrollmentTermReader10);
        org.junit.Assert.assertNotNull(enrollmentTermReader12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TEACHERS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TEACHERS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TEACHERS));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Include include0 = edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Include.OBSERVED_USERS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Include.OBSERVED_USERS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Include.OBSERVED_USERS));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.LoginImpl loginImpl8 = new edu.ksu.canvas.impl.LoginImpl("conclude", (java.lang.Integer) 0, oauthToken2, restClient3, 10, (int) (byte) 1, (java.lang.Integer) (-1), (java.lang.Boolean) true);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.Login>> loginListConsumer9 = null;
        edu.ksu.canvas.interfaces.LoginReader loginReader10 = loginImpl8.withCallback(loginListConsumer9);
        edu.ksu.canvas.model.Login login11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.Login> loginOptional12 = loginImpl8.deleteLogin(login11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loginReader10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        long long0 = edu.ksu.canvas.model.GradingStandard.GradingSchemeEntry.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Type type0 = edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Type.EVENT;
        java.lang.String str1 = type0.toString();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Type.EVENT + "'", type0.equals(edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Type.EVENT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "event" + "'", str1, "event");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 1, (int) (short) -1, (java.lang.Integer) 1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.MigrationIssue> migrationIssueList11 = migrationIssueImpl8.getAccountMigrationIssues("deleted", (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.QuizImpl quizImpl8 = new edu.ksu.canvas.impl.QuizImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 10, 100, (java.lang.Integer) 10, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.QuizWriter quizWriter10 = quizImpl8.writeAsCanvasUser("");
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.assignment.Quiz>> quizListConsumer11 = null;
        edu.ksu.canvas.interfaces.QuizReader quizReader12 = quizImpl8.withCallback(quizListConsumer11);
        edu.ksu.canvas.interfaces.QuizWriter quizWriter14 = quizImpl8.writeAsCanvasUser("conclude/api/v1/course_progress");
        org.junit.Assert.assertNotNull(quizWriter10);
        org.junit.Assert.assertNotNull(quizReader12);
        org.junit.Assert.assertNotNull(quizWriter14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        edu.ksu.canvas.net.RestClient restClient2 = null;
        edu.ksu.canvas.impl.RestCanvasMessenger restCanvasMessenger3 = new edu.ksu.canvas.impl.RestCanvasMessenger(10, (int) (byte) 0, restClient2);
        edu.ksu.canvas.oauth.OauthToken oauthToken4 = null;
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup6 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.lang.String str7 = assignmentGroup6.getSisSourceId();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = assignmentGroup6.toPostMap(false);
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.net.Response response10 = restCanvasMessenger3.deleteFromCanvas(oauthToken4, "total_scores", strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional11 = contentMigrationImpl8.getGroupContentMigration("conclude", (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        edu.ksu.canvas.net.RefreshingRestClient refreshingRestClient0 = new edu.ksu.canvas.net.RefreshingRestClient();
        edu.ksu.canvas.oauth.OauthToken oauthToken1 = null;
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup3 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.lang.String str4 = assignmentGroup3.getSisSourceId();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = assignmentGroup3.toPostMap(false);
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.net.Response response9 = refreshingRestClient0.sendApiDelete(oauthToken1, "course_progress", strMap6, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.COURSE_IMAGE;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.COURSE_IMAGE + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.COURSE_IMAGE));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.DESIGNER;
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.DESIGNER + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.DESIGNER));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.ContentMigration> contentMigrationList10 = contentMigrationImpl8.getAccountContentMigrations("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.TEACHERS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.TEACHERS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.TEACHERS));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TEACHERS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TEACHERS + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TEACHERS));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        edu.ksu.canvas.net.RestClient restClient2 = null;
        edu.ksu.canvas.impl.RestCanvasMessenger restCanvasMessenger3 = new edu.ksu.canvas.impl.RestCanvasMessenger(10, (int) (byte) 0, restClient2);
        edu.ksu.canvas.oauth.OauthToken oauthToken4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.net.Response> responseList6 = restCanvasMessenger3.getFromCanvas(oauthToken4, "conclude");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        edu.ksu.canvas.model.assignment.QuizSubmissionQuestion quizSubmissionQuestion0 = new edu.ksu.canvas.model.assignment.QuizSubmissionQuestion();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        edu.ksu.canvas.model.CalendarEvent.WorkflowState workflowState0 = edu.ksu.canvas.model.CalendarEvent.WorkflowState.LOCKED;
        org.junit.Assert.assertTrue("'" + workflowState0 + "' != '" + edu.ksu.canvas.model.CalendarEvent.WorkflowState.LOCKED + "'", workflowState0.equals(edu.ksu.canvas.model.CalendarEvent.WorkflowState.LOCKED));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        long long0 = edu.ksu.canvas.model.Conversation.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader10 = courseSettingsImpl8.readAsCanvasUser("");
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter12 = courseSettingsImpl8.writeAsCanvasUser("conclude");
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter14 = courseSettingsImpl8.writeAsSisUser("conclude/api/v1/course_progress");
        org.junit.Assert.assertNotNull(courseSettingsReader10);
        org.junit.Assert.assertNotNull(courseSettingsWriter12);
        org.junit.Assert.assertNotNull(courseSettingsWriter14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.TOTAL_STUDENTS;
        java.lang.String str1 = include0.toString();
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.TOTAL_STUDENTS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.TOTAL_STUDENTS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "total_students" + "'", str1, "total_students");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setSyllabusBody("total_students");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String str0 = edu.ksu.canvas.util.KeyFirstComparator.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "key" + "'", str0, "key");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        edu.ksu.canvas.requestOptions.ListAssignmentGroupOptions.Include include0 = edu.ksu.canvas.requestOptions.ListAssignmentGroupOptions.Include.DISCUSSION_TOPIC;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListAssignmentGroupOptions.Include.DISCUSSION_TOPIC + "'", include0.equals(edu.ksu.canvas.requestOptions.ListAssignmentGroupOptions.Include.DISCUSSION_TOPIC));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ProgressImpl progressImpl8 = new edu.ksu.canvas.impl.ProgressImpl("", (java.lang.Integer) 100, oauthToken2, restClient3, 1, (int) (byte) 100, (java.lang.Integer) 100, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.Progress> progressOptional10 = progressImpl8.getProgress((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl8 = new edu.ksu.canvas.impl.AssignmentImpl("", (java.lang.Integer) 1, oauthToken2, restClient3, (int) ' ', (int) (short) -1, (java.lang.Integer) 100, (java.lang.Boolean) false);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.assignment.Assignment>> assignmentListConsumer9 = null;
        edu.ksu.canvas.interfaces.AssignmentReader assignmentReader10 = assignmentImpl8.withCallback(assignmentListConsumer9);
        edu.ksu.canvas.model.assignment.Assignment assignment12 = new edu.ksu.canvas.model.assignment.Assignment();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.assignment.Assignment> assignmentOptional13 = assignmentImpl8.editAssignment("deleted", assignment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(assignmentReader10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        edu.ksu.canvas.requestOptions.CreateConversationOptions.MediaCommentType mediaCommentType0 = edu.ksu.canvas.requestOptions.CreateConversationOptions.MediaCommentType.VIDEO;
        org.junit.Assert.assertTrue("'" + mediaCommentType0 + "' != '" + edu.ksu.canvas.requestOptions.CreateConversationOptions.MediaCommentType.VIDEO + "'", mediaCommentType0.equals(edu.ksu.canvas.requestOptions.CreateConversationOptions.MediaCommentType.VIDEO));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.OrderBy orderBy0 = edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.OrderBy.POSITION;
        org.junit.Assert.assertTrue("'" + orderBy0 + "' != '" + edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.OrderBy.POSITION + "'", orderBy0.equals(edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.OrderBy.POSITION));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        edu.ksu.canvas.errors.GenericErrorHandler genericErrorHandler0 = new edu.ksu.canvas.errors.GenericErrorHandler();
        org.apache.http.HttpRequest httpRequest1 = null;
        org.apache.http.HttpResponse httpResponse2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = genericErrorHandler0.shouldHandle(httpRequest1, httpResponse2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        java.lang.String str1 = course0.getSisCourseId();
        course0.setEnrollmentTermId((-1L));
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentState enrollmentState0 = edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentState.ACTIVE;
        org.junit.Assert.assertTrue("'" + enrollmentState0 + "' != '" + edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentState.ACTIVE + "'", enrollmentState0.equals(edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentState.ACTIVE));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional11 = contentMigrationImpl8.getAccountContentMigration("key", (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        long long0 = edu.ksu.canvas.model.CalendarEvent.getSerialVersionUID();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        edu.ksu.canvas.model.AuthenticationLog authenticationLog0 = new edu.ksu.canvas.model.AuthenticationLog();
        edu.ksu.canvas.oauth.OauthToken oauthToken3 = null;
        edu.ksu.canvas.net.RestClient restClient4 = null;
        edu.ksu.canvas.impl.AccountImpl accountImpl9 = new edu.ksu.canvas.impl.AccountImpl("conclude/api/v1/course_progress", (java.lang.Integer) 100, oauthToken3, restClient4, 100, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.AccountReader accountReader11 = accountImpl9.readAsCanvasUser("undated");
        authenticationLog0.setLinked((java.lang.Object) accountReader11);
        org.junit.Assert.assertNotNull(accountReader11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        edu.ksu.canvas.requestOptions.CompleteQuizSubmissionOptions completeQuizSubmissionOptions5 = new edu.ksu.canvas.requestOptions.CompleteQuizSubmissionOptions("conclude", (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 10, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType importType2 = edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType.instructure_csv;
        java.io.InputStream inputStream4 = null;
        edu.ksu.canvas.requestOptions.CreateSisImportOptions createSisImportOptions7 = new edu.ksu.canvas.requestOptions.CreateSisImportOptions("submission_history", "total_scores", importType2, "", inputStream4, false, true);
        java.lang.String str8 = createSisImportOptions7.getAccountId();
        org.junit.Assert.assertTrue("'" + importType2 + "' != '" + edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType.instructure_csv + "'", importType2.equals(edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType.instructure_csv));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "submission_history" + "'", str8, "submission_history");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ContentMigrationWriter contentMigrationWriter10 = contentMigrationImpl8.writeAsSisUser("");
        edu.ksu.canvas.requestOptions.CreateContentMigrationOptions createContentMigrationOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional14 = contentMigrationImpl8.updateAccountContentMigration("hi!/api/v1/event", (java.lang.Integer) 100, createContentMigrationOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentMigrationWriter10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.STUDENT;
        java.lang.String str1 = enrollmentType0.toString();
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.STUDENT + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.STUDENT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "student" + "'", str1, "student");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        edu.ksu.canvas.net.RestClient restClient2 = null;
        edu.ksu.canvas.impl.RestCanvasMessenger restCanvasMessenger3 = new edu.ksu.canvas.impl.RestCanvasMessenger(10, (int) (byte) 0, restClient2);
        edu.ksu.canvas.oauth.OauthToken oauthToken4 = null;
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup12 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.lang.String str13 = assignmentGroup12.getSisSourceId();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = assignmentGroup12.toPostMap(false);
        java.lang.String str16 = edu.ksu.canvas.util.CanvasURLBuilder.buildCanvasUrl("conclude", 1, "course_progress", strMap15);
        java.lang.String str17 = edu.ksu.canvas.util.HttpParameterBuilder.buildParameters(strMap15);
        java.lang.String str18 = edu.ksu.canvas.util.CanvasURLBuilder.buildCanvasUrl("hi!", (int) (byte) 1, "event", strMap15);
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.net.Response response19 = restCanvasMessenger3.deleteFromCanvas(oauthToken4, "event", strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "conclude/api/v1/course_progress" + "'", str16, "conclude/api/v1/course_progress");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!/api/v1/event" + "'", str18, "hi!/api/v1/event");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        edu.ksu.canvas.enums.SectionIncludes sectionIncludes0 = edu.ksu.canvas.enums.SectionIncludes.PASSBACK_STATUS;
        org.junit.Assert.assertTrue("'" + sectionIncludes0 + "' != '" + edu.ksu.canvas.enums.SectionIncludes.PASSBACK_STATUS + "'", sectionIncludes0.equals(edu.ksu.canvas.enums.SectionIncludes.PASSBACK_STATUS));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        edu.ksu.canvas.requestOptions.ListAccountOptions.Include include0 = edu.ksu.canvas.requestOptions.ListAccountOptions.Include.LTI_GUID;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListAccountOptions.Include.LTI_GUID + "'", include0.equals(edu.ksu.canvas.requestOptions.ListAccountOptions.Include.LTI_GUID));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setEnrollMe((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = course0.getOpenEnrollment();
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        edu.ksu.canvas.errors.ErrorDetails errorDetails0 = new edu.ksu.canvas.errors.ErrorDetails();
        java.lang.String str1 = errorDetails0.getAttribute();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        edu.ksu.canvas.requestOptions.GetQuizSubmissionsOptions.Include[] includeArray2 = new edu.ksu.canvas.requestOptions.GetQuizSubmissionsOptions.Include[] {};
        edu.ksu.canvas.requestOptions.GetQuizSubmissionsOptions getQuizSubmissionsOptions3 = new edu.ksu.canvas.requestOptions.GetQuizSubmissionsOptions("total_scores", "course_progress", includeArray2);
        org.junit.Assert.assertNotNull(includeArray2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions2 = new edu.ksu.canvas.requestOptions.CreateConversationOptions("", "course_progress");
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions4 = createConversationOptions2.userNote((java.lang.Boolean) true);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions11 = createConversationOptions4.attachmentIds((java.util.List<java.lang.Integer>) intList9);
        org.junit.Assert.assertNotNull(createConversationOptions4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(createConversationOptions11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        long long0 = edu.ksu.canvas.model.AuthenticationLog.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions getMultipleSubmissionsOptions1 = new edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions("event");
        edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions getMultipleSubmissionsOptions3 = getMultipleSubmissionsOptions1.grouped((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(getMultipleSubmissionsOptions3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include include0 = edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.AVATAR_URL;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.AVATAR_URL + "'", include0.equals(edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.AVATAR_URL));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.PUBLIC_DESCRIPTION;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.PUBLIC_DESCRIPTION + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.PUBLIC_DESCRIPTION));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = assignment0.isOmitFromFinalGrade();
        edu.ksu.canvas.model.assignment.AssignmentDate[] assignmentDateArray4 = new edu.ksu.canvas.model.assignment.AssignmentDate[] {};
        java.util.ArrayList<edu.ksu.canvas.model.assignment.AssignmentDate> assignmentDateList5 = new java.util.ArrayList<edu.ksu.canvas.model.assignment.AssignmentDate>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<edu.ksu.canvas.model.assignment.AssignmentDate>) assignmentDateList5, assignmentDateArray4);
        assignment0.setAllDates((java.util.List<edu.ksu.canvas.model.assignment.AssignmentDate>) assignmentDateList5);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(assignmentDateArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        edu.ksu.canvas.oauth.TokenRefreshResponse tokenRefreshResponse0 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.oauth.TokenRefreshResponse.TokenUser tokenUser1 = tokenRefreshResponse0.new TokenUser();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to edu.ksu.canvas.oauth.TokenRefreshResponse$TokenUser with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setIsPublic((java.lang.Boolean) false);
        java.lang.String str3 = course0.getTimeZone();
        java.lang.String str4 = course0.getPublicDescription();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AccountImpl accountImpl8 = new edu.ksu.canvas.impl.AccountImpl("conclude/api/v1/course_progress", (java.lang.Integer) 100, oauthToken2, restClient3, 100, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Boolean) true);
        edu.ksu.canvas.model.Account account10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.Account> accountOptional11 = accountImpl8.createAccount("undated", account10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.CourseSettings>> courseSettingsListConsumer9 = null;
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader10 = courseSettingsImpl8.withCallback(courseSettingsListConsumer9);
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter12 = courseSettingsImpl8.writeAsSisUser("conclude/api/v1/course_progress");
        org.junit.Assert.assertNotNull(courseSettingsReader10);
        org.junit.Assert.assertNotNull(courseSettingsWriter12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ContentMigrationWriter contentMigrationWriter10 = contentMigrationImpl8.writeAsSisUser("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional13 = contentMigrationImpl8.getUserContentMigration("hi!/api/v1/event", (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentMigrationWriter10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        edu.ksu.canvas.model.report.AccountReportSummary accountReportSummary0 = new edu.ksu.canvas.model.report.AccountReportSummary();
        edu.ksu.canvas.model.report.AccountReport accountReport1 = accountReportSummary0.getLastRun();
        org.junit.Assert.assertNull(accountReport1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader10 = courseSettingsImpl8.readAsCanvasUser("deleted");
        org.junit.Assert.assertNotNull(courseSettingsReader10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        edu.ksu.canvas.model.Enrollment enrollment0 = new edu.ksu.canvas.model.Enrollment();
        enrollment0.setUserId("");
        java.lang.String str3 = enrollment0.getType();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl8 = new edu.ksu.canvas.impl.AssignmentImpl("", (java.lang.Integer) 1, oauthToken2, restClient3, (int) ' ', (int) (short) -1, (java.lang.Integer) 100, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.AssignmentReader assignmentReader10 = assignmentImpl8.readAsSisUser("course_progress");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions listCourseAssignmentsOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.assignment.Assignment> assignmentList12 = assignmentImpl8.listCourseAssignments(listCourseAssignmentsOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(assignmentReader10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include1 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES;
        assignment0.setIntegrationData((java.lang.Object) include1);
        assignment0.setId((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + include1 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES + "'", include1.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        edu.ksu.canvas.requestOptions.GetQuizSubmissionsOptions.Include include0 = edu.ksu.canvas.requestOptions.GetQuizSubmissionsOptions.Include.USER;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetQuizSubmissionsOptions.Include.USER + "'", include0.equals(edu.ksu.canvas.requestOptions.GetQuizSubmissionsOptions.Include.USER));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        java.lang.String str1 = assignment0.getCourseId();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        edu.ksu.canvas.requestOptions.CompleteQuizSubmissionOptions completeQuizSubmissionOptions5 = new edu.ksu.canvas.requestOptions.CompleteQuizSubmissionOptions("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1, "deleted");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        edu.ksu.canvas.model.Conversation.ConversationFlags conversationFlags0 = edu.ksu.canvas.model.Conversation.ConversationFlags.attachments;
        org.junit.Assert.assertTrue("'" + conversationFlags0 + "' != '" + edu.ksu.canvas.model.Conversation.ConversationFlags.attachments + "'", conversationFlags0.equals(edu.ksu.canvas.model.Conversation.ConversationFlags.attachments));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.QuizImpl quizImpl8 = new edu.ksu.canvas.impl.QuizImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 10, 100, (java.lang.Integer) 10, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.QuizReader quizReader10 = quizImpl8.readAsSisUser("hi!");
        edu.ksu.canvas.model.assignment.Quiz quiz11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.assignment.Quiz> quizOptional13 = quizImpl8.updateQuiz(quiz11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(quizReader10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("course_progress", (java.lang.Integer) 1, oauthToken2, restClient3, (int) (byte) -1, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.MigrationIssue> migrationIssueList11 = migrationIssueImpl8.getUserMigrationIssues("", (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        edu.ksu.canvas.requestOptions.ListExternalToolsOptions listExternalToolsOptions1 = new edu.ksu.canvas.requestOptions.ListExternalToolsOptions("course_progress");
        edu.ksu.canvas.requestOptions.ListExternalToolsOptions listExternalToolsOptions3 = listExternalToolsOptions1.includeParentTools((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(listExternalToolsOptions3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        edu.ksu.canvas.model.Enrollment enrollment0 = new edu.ksu.canvas.model.Enrollment();
        enrollment0.setUserId("");
        java.util.Date date3 = null;
        enrollment0.setLastActivityAt(date3);
        edu.ksu.canvas.model.User user5 = enrollment0.getUser();
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_STUDENTS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_STUDENTS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_STUDENTS));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions2 = new edu.ksu.canvas.requestOptions.AccountReportOptions("undated", "conclude");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions4 = accountReportOptions2.sections("");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions6 = accountReportOptions4.courses("conclude/api/v1/course_progress");
        org.junit.Assert.assertNotNull(accountReportOptions4);
        org.junit.Assert.assertNotNull(accountReportOptions6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        edu.ksu.canvas.model.UserDisplay userDisplay0 = new edu.ksu.canvas.model.UserDisplay();
        java.lang.String str1 = userDisplay0.getHtmlUrl();
        userDisplay0.setId((int) '#');
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.NEEDS_GRADING_COUNT;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.NEEDS_GRADING_COUNT + "'", include0.equals(edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.NEEDS_GRADING_COUNT));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setUnpublishable((java.lang.Boolean) true);
        edu.ksu.canvas.model.assignment.Assignment.NeedsGradingCount needsGradingCount3 = assignment0.new NeedsGradingCount();
        needsGradingCount3.setSectionId("submission_history");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        edu.ksu.canvas.model.CommunicationChannel.Type type0 = edu.ksu.canvas.model.CommunicationChannel.Type.EMAIL;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + edu.ksu.canvas.model.CommunicationChannel.Type.EMAIL + "'", type0.equals(edu.ksu.canvas.model.CommunicationChannel.Type.EMAIL));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment0.setPointsPossible((java.lang.Double) 0.0d);
        assignment0.setMuted((java.lang.Boolean) false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include include0 = edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.LOCKED;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.LOCKED + "'", include0.equals(edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.LOCKED));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setOffer((java.lang.Boolean) true);
        course0.setWorkflowState("hi!/api/v1/event");
        course0.setPublicSyllabus((java.lang.Boolean) false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.lang.String str0 = edu.ksu.canvas.constants.CanvasConstants.URLENCODING_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ProgressImpl progressImpl8 = new edu.ksu.canvas.impl.ProgressImpl("", (java.lang.Integer) 100, oauthToken2, restClient3, 1, (int) (byte) 100, (java.lang.Integer) 100, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ProgressReader progressReader10 = progressImpl8.readAsSisUser("total_scores");
        org.junit.Assert.assertNotNull(progressReader10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        edu.ksu.canvas.requestOptions.ListAccountOptions listAccountOptions0 = new edu.ksu.canvas.requestOptions.ListAccountOptions();
        edu.ksu.canvas.requestOptions.ListAccountOptions.Include include1 = edu.ksu.canvas.requestOptions.ListAccountOptions.Include.LTI_GUID;
        edu.ksu.canvas.requestOptions.ListAccountOptions.Include[] includeArray2 = new edu.ksu.canvas.requestOptions.ListAccountOptions.Include[] { include1 };
        java.util.ArrayList<edu.ksu.canvas.requestOptions.ListAccountOptions.Include> includeList3 = new java.util.ArrayList<edu.ksu.canvas.requestOptions.ListAccountOptions.Include>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<edu.ksu.canvas.requestOptions.ListAccountOptions.Include>) includeList3, includeArray2);
        edu.ksu.canvas.requestOptions.ListAccountOptions listAccountOptions5 = listAccountOptions0.includes((java.util.List<edu.ksu.canvas.requestOptions.ListAccountOptions.Include>) includeList3);
        org.junit.Assert.assertTrue("'" + include1 + "' != '" + edu.ksu.canvas.requestOptions.ListAccountOptions.Include.LTI_GUID + "'", include1.equals(edu.ksu.canvas.requestOptions.ListAccountOptions.Include.LTI_GUID));
        org.junit.Assert.assertNotNull(includeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(listAccountOptions5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.EnrollmentType.TA;
        java.lang.String str1 = enrollmentType0.toString();
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.EnrollmentType.TA + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.EnrollmentType.TA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ta" + "'", str1, "ta");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions getMultipleSubmissionsOptions1 = new edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions("event");
        edu.ksu.canvas.model.assignment.Assignment assignment2 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment2.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment2.setPointsPossible((java.lang.Double) 0.0d);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "undated", "deleted", "hi!", "undated", "hi!", "", "deleted", "submission_history", "deleted" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        assignment2.setSubmissionTypes((java.util.List<java.lang.String>) strList18);
        edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions getMultipleSubmissionsOptions21 = getMultipleSubmissionsOptions1.assignmentIds((java.util.List<java.lang.String>) strList18);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(getMultipleSubmissionsOptions21);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl8 = new edu.ksu.canvas.impl.AssignmentImpl("", (java.lang.Integer) 1, oauthToken2, restClient3, (int) ' ', (int) (short) -1, (java.lang.Integer) 100, (java.lang.Boolean) false);
        edu.ksu.canvas.model.assignment.Assignment assignment10 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment10.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        java.lang.Boolean boolean13 = assignment10.isOmitFromFinalGrade();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.assignment.Assignment> assignmentOptional14 = assignmentImpl8.editAssignment("hi!/api/v1/event", assignment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        edu.ksu.canvas.model.SisImport sisImport0 = new edu.ksu.canvas.model.SisImport();
        java.lang.String str1 = sisImport0.getBatchModeTermId();
        edu.ksu.canvas.model.sisimport.SisImportErrorsAttachment sisImportErrorsAttachment2 = null;
        sisImport0.setErrorsAttachment(sisImportErrorsAttachment2);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        edu.ksu.canvas.net.RefreshingRestClient refreshingRestClient0 = new edu.ksu.canvas.net.RefreshingRestClient();
        edu.ksu.canvas.oauth.OauthToken oauthToken1 = null;
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup6 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.lang.String str7 = assignmentGroup6.getSisSourceId();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = assignmentGroup6.toPostMap(false);
        java.lang.String str10 = edu.ksu.canvas.util.CanvasURLBuilder.buildCanvasUrl("conclude", 1, "course_progress", strMap9);
        java.lang.String str11 = edu.ksu.canvas.util.HttpParameterBuilder.buildParameters(strMap9);
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.net.Response response14 = refreshingRestClient0.sendApiPut(oauthToken1, "hi!/api/v1/event", strMap9, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "conclude/api/v1/course_progress" + "'", str10, "conclude/api/v1/course_progress");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        edu.ksu.canvas.model.User user0 = new edu.ksu.canvas.model.User();
        long long1 = user0.getId();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setOffer((java.lang.Boolean) true);
        course0.setWorkflowState("hi!/api/v1/event");
        course0.setImageDownloadUrl("");
        java.util.List<edu.ksu.canvas.model.UserDisplay> userDisplayList9 = course0.getTeachers();
        org.junit.Assert.assertNull(userDisplayList9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        edu.ksu.canvas.requestOptions.UpdateCoursesOptions.EventType eventType0 = edu.ksu.canvas.requestOptions.UpdateCoursesOptions.EventType.UNDELETE;
        org.junit.Assert.assertTrue("'" + eventType0 + "' != '" + edu.ksu.canvas.requestOptions.UpdateCoursesOptions.EventType.UNDELETE + "'", eventType0.equals(edu.ksu.canvas.requestOptions.UpdateCoursesOptions.EventType.UNDELETE));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        edu.ksu.canvas.model.AccountAdmin accountAdmin0 = new edu.ksu.canvas.model.AccountAdmin();
        java.lang.Integer int1 = accountAdmin0.getRoleId();
        java.lang.Integer int2 = accountAdmin0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl8 = new edu.ksu.canvas.impl.AssignmentImpl("", (java.lang.Integer) 1, oauthToken2, restClient3, (int) ' ', (int) (short) -1, (java.lang.Integer) 100, (java.lang.Boolean) false);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.assignment.Assignment>> assignmentListConsumer9 = null;
        edu.ksu.canvas.interfaces.AssignmentReader assignmentReader10 = assignmentImpl8.withCallback(assignmentListConsumer9);
        edu.ksu.canvas.interfaces.AssignmentWriter assignmentWriter12 = assignmentImpl8.writeAsSisUser("hi!/api/v1/event");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.assignment.Assignment> assignmentOptional15 = assignmentImpl8.deleteAssignment("conclude", (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(assignmentReader10);
        org.junit.Assert.assertNotNull(assignmentWriter12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setIsPublic((java.lang.Boolean) false);
        course0.setDefaultView("");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions2 = new edu.ksu.canvas.requestOptions.CreateConversationOptions("", "course_progress");
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions4 = createConversationOptions2.userNote((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(createConversationOptions4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        edu.ksu.canvas.net.SimpleRestClient simpleRestClient0 = new edu.ksu.canvas.net.SimpleRestClient();
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup8 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.lang.String str9 = assignmentGroup8.getSisSourceId();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = assignmentGroup8.toPostMap(false);
        java.lang.String str12 = edu.ksu.canvas.util.CanvasURLBuilder.buildCanvasUrl("conclude", 1, "course_progress", strMap11);
        java.lang.String str13 = edu.ksu.canvas.util.HttpParameterBuilder.buildParameters(strMap11);
        java.lang.String str14 = edu.ksu.canvas.util.CanvasURLBuilder.buildCanvasUrl("hi!", (int) (byte) 1, "event", strMap11);
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = simpleRestClient0.sendUpload("conclude/api/v1/course_progress", strMap11, inputStream15, "UTF-8", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input stream may not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "conclude/api/v1/course_progress" + "'", str12, "conclude/api/v1/course_progress");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!/api/v1/event" + "'", str14, "hi!/api/v1/event");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.STUDENT_VIEW;
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.STUDENT_VIEW + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.EnrollmentType.STUDENT_VIEW));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        edu.ksu.canvas.model.ContentMigration.WorkflowState workflowState0 = edu.ksu.canvas.model.ContentMigration.WorkflowState.pre_processed;
        org.junit.Assert.assertTrue("'" + workflowState0 + "' != '" + edu.ksu.canvas.model.ContentMigration.WorkflowState.pre_processed + "'", workflowState0.equals(edu.ksu.canvas.model.ContentMigration.WorkflowState.pre_processed));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions1 = new edu.ksu.canvas.requestOptions.GetUsersInCourseOptions("key");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions3 = getUsersInCourseOptions1.searchTerm("submission_history");
        org.junit.Assert.assertNotNull(getUsersInCourseOptions3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RefreshingRestClient refreshingRestClient3 = new edu.ksu.canvas.net.RefreshingRestClient();
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("total_students", (java.lang.Integer) 1, oauthToken2, (edu.ksu.canvas.net.RestClient) refreshingRestClient3, (int) '#', 1, (java.lang.Integer) 0, (java.lang.Boolean) true);
        edu.ksu.canvas.oauth.OauthToken oauthToken9 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.net.Response response14 = refreshingRestClient3.sendJsonPost(oauthToken9, "key", "deleted", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        edu.ksu.canvas.model.assignment.AssignmentOverride assignmentOverride0 = new edu.ksu.canvas.model.assignment.AssignmentOverride();
        assignmentOverride0.setTitle("deleted");
        java.util.Date date3 = null;
        assignmentOverride0.setUnlockAt(date3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Exclude exclude0 = edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Exclude.CHILD_EVENTS;
        org.junit.Assert.assertTrue("'" + exclude0 + "' != '" + edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Exclude.CHILD_EVENTS + "'", exclude0.equals(edu.ksu.canvas.requestOptions.ListCalendarEventsOptions.Exclude.CHILD_EVENTS));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ContentMigrationWriter contentMigrationWriter10 = contentMigrationImpl8.writeAsSisUser("");
        edu.ksu.canvas.interfaces.ContentMigrationWriter contentMigrationWriter12 = contentMigrationWriter10.writeAsSisUser("");
        edu.ksu.canvas.requestOptions.CreateContentMigrationOptions createContentMigrationOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional16 = contentMigrationWriter12.updateGroupContentMigration("ta", (java.lang.Integer) 1, createContentMigrationOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentMigrationWriter10);
        org.junit.Assert.assertNotNull(contentMigrationWriter12);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setOffer((java.lang.Boolean) true);
        course0.setWorkflowState("hi!/api/v1/event");
        course0.setImageDownloadUrl("");
        java.lang.String str9 = course0.getIntegrationId();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include include0 = edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.CAN_BE_REMOVED;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.CAN_BE_REMOVED + "'", include0.equals(edu.ksu.canvas.requestOptions.GetEnrollmentOptions.Include.CAN_BE_REMOVED));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setUnpublishable((java.lang.Boolean) true);
        edu.ksu.canvas.model.assignment.Assignment.NeedsGradingCount needsGradingCount3 = assignment0.new NeedsGradingCount();
        java.lang.Boolean boolean4 = assignment0.isOnlyVisibleToOverrides();
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        edu.ksu.canvas.model.assignment.AssignmentOverride assignmentOverride0 = new edu.ksu.canvas.model.assignment.AssignmentOverride();
        assignmentOverride0.setTitle("conclude");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        edu.ksu.canvas.model.User user0 = new edu.ksu.canvas.model.User();
        java.time.Instant instant1 = null;
        user0.setCreatedAt(instant1);
        java.lang.String str3 = user0.getConfirmationUrl();
        java.lang.String str4 = user0.getLoginId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.oauth.OauthToken oauthToken5 = null;
        edu.ksu.canvas.net.RefreshingRestClient refreshingRestClient6 = new edu.ksu.canvas.net.RefreshingRestClient();
        edu.ksu.canvas.impl.AuthenticationLogImpl authenticationLogImpl11 = new edu.ksu.canvas.impl.AuthenticationLogImpl("submission_history", (java.lang.Integer) 0, oauthToken5, (edu.ksu.canvas.net.RestClient) refreshingRestClient6, (int) (short) -1, (int) (byte) 1, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.impl.ProgressImpl progressImpl16 = new edu.ksu.canvas.impl.ProgressImpl("conclude", (java.lang.Integer) 100, oauthToken2, (edu.ksu.canvas.net.RestClient) refreshingRestClient6, (int) (byte) 1, (int) 'a', (java.lang.Integer) (-1), (java.lang.Boolean) false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment0.setPointsPossible((java.lang.Double) 0.0d);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "undated", "deleted", "hi!", "undated", "hi!", "", "deleted", "submission_history", "deleted" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        assignment0.setSubmissionTypes((java.util.List<java.lang.String>) strList16);
        java.util.Date date19 = assignment0.getCreatedAt();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        edu.ksu.canvas.requestOptions.CreateContentMigrationOptions.MigrationType migrationType2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "ta", "UTF-8" };
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.requestOptions.CreateCourseContentMigrationOptions createCourseContentMigrationOptions7 = new edu.ksu.canvas.requestOptions.CreateCourseContentMigrationOptions("hi!/api/v1/event", "course_progress", migrationType2, false, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter10 = courseSettingsImpl8.writeAsCanvasUser("deleted");
        edu.ksu.canvas.model.CourseSettings courseSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.CourseSettings> courseSettingsOptional13 = courseSettingsWriter10.updateCourseSettings("hi!/api/v1/event", courseSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSettingsWriter10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TOTAL_STUDENTS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TOTAL_STUDENTS + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleCourseOptions.Include.TOTAL_STUDENTS));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = assignment0.isOmitFromFinalGrade();
        java.lang.Boolean boolean4 = assignment0.isPublished();
        assignment0.setPublished((java.lang.Boolean) false);
        assignment0.setCourseId("hi!/api/v1/event");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions2 = new edu.ksu.canvas.requestOptions.CreateConversationOptions("", "course_progress");
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions4 = createConversationOptions2.groupConversation((java.lang.Boolean) true);
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions6 = createConversationOptions4.groupConversation((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(createConversationOptions4);
        org.junit.Assert.assertNotNull(createConversationOptions6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        edu.ksu.canvas.model.SisImport sisImport0 = new edu.ksu.canvas.model.SisImport();
        java.time.Instant instant1 = sisImport0.getUpdatedAt();
        org.junit.Assert.assertNull(instant1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions getMultipleSubmissionsOptions1 = new edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions("conclude/api/v1/course_progress");
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.requestOptions.GetMultipleSubmissionsOptions getMultipleSubmissionsOptions3 = getMultipleSubmissionsOptions1.gradedSince(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setUnpublishable((java.lang.Boolean) true);
        edu.ksu.canvas.model.assignment.Assignment.NeedsGradingCount needsGradingCount3 = assignment0.new NeedsGradingCount();
        needsGradingCount3.setNeedsGradingCount((java.lang.Integer) 10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.VISIBILITY;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.VISIBILITY + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.VISIBILITY));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.FAVORITES;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.FAVORITES + "'", include0.equals(edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.FAVORITES));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        edu.ksu.canvas.errors.GenericErrorHandler genericErrorHandler0 = new edu.ksu.canvas.errors.GenericErrorHandler();
        org.apache.http.HttpRequest httpRequest1 = null;
        org.apache.http.HttpResponse httpResponse2 = null;
        // The following exception was thrown during execution in test generation
        try {
            genericErrorHandler0.handle(httpRequest1, httpResponse2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        edu.ksu.canvas.requestOptions.ListAccountOptions.Include include0 = edu.ksu.canvas.requestOptions.ListAccountOptions.Include.REGISTRATION_SETTINGS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListAccountOptions.Include.REGISTRATION_SETTINGS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListAccountOptions.Include.REGISTRATION_SETTINGS));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = assignment0.isOmitFromFinalGrade();
        java.lang.Boolean boolean4 = assignment0.isPublished();
        assignment0.setGradingStandardId("total_scores");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        edu.ksu.canvas.exception.ObjectNotFoundException objectNotFoundException2 = new edu.ksu.canvas.exception.ObjectNotFoundException("course_progress", "hi!/api/v1/event");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        edu.ksu.canvas.model.Enrollment enrollment0 = new edu.ksu.canvas.model.Enrollment();
        enrollment0.setUserId("");
        java.util.Date date3 = null;
        enrollment0.setLastActivityAt(date3);
        java.util.Date date5 = null;
        enrollment0.setUpdatedAt(date5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setOffer((java.lang.Boolean) true);
        course0.setWorkflowState("hi!/api/v1/event");
        course0.setImageDownloadUrl("");
        course0.setImageId((java.lang.Integer) (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter10 = courseSettingsImpl8.writeAsCanvasUser("deleted");
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader12 = courseSettingsImpl8.readAsCanvasUser("total_students");
        org.junit.Assert.assertNotNull(courseSettingsWriter10);
        org.junit.Assert.assertNotNull(courseSettingsReader12);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        java.lang.String[] strArray1 = assignment0.getAllowedExtensions();
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTermId("total_students");
        course0.setPublicSyllabusToAuth((java.lang.Boolean) false);
        course0.setGradingStandardId((java.lang.Long) 10L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.SUBMISSION_COMMENTS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.SUBMISSION_COMMENTS + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSubmissionsOptions.Include.SUBMISSION_COMMENTS));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State state0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.AVAILABLE;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.AVAILABLE + "'", state0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.State.AVAILABLE));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 1, (int) (short) -1, (java.lang.Integer) 1, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.MigrationIssueReader migrationIssueReader10 = migrationIssueImpl8.readAsSisUser("conclude");
        org.junit.Assert.assertNotNull(migrationIssueReader10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        edu.ksu.canvas.model.wrapper.EnrollmentTermWrapper enrollmentTermWrapper0 = new edu.ksu.canvas.model.wrapper.EnrollmentTermWrapper();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = assignment0.isOnlyVisibleToOverrides();
        edu.ksu.canvas.model.assignment.Assignment.TurnitinSettings turnitinSettings4 = assignment0.getTurnitinSettings();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNull(turnitinSettings4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup0 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.util.List<edu.ksu.canvas.model.assignment.Assignment> assignmentList1 = assignmentGroup0.getAssignments();
        assignmentGroup0.setId((java.lang.Integer) 100);
        java.lang.Integer int4 = assignmentGroup0.getPosition();
        org.junit.Assert.assertNull(assignmentList1);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setHideFinalGrades((java.lang.Boolean) false);
        edu.ksu.canvas.model.EnrollmentTerm enrollmentTerm3 = null;
        course0.setEnrollmentTerm(enrollmentTerm3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        edu.ksu.canvas.model.report.AccountReport accountReport0 = new edu.ksu.canvas.model.report.AccountReport();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ProgressImpl progressImpl8 = new edu.ksu.canvas.impl.ProgressImpl("", (java.lang.Integer) 100, oauthToken2, restClient3, 1, (int) (byte) 100, (java.lang.Integer) 100, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ProgressReader progressReader10 = progressImpl8.readAsSisUser("hi!/api/v1/event");
        org.junit.Assert.assertNotNull(progressReader10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        edu.ksu.canvas.model.CalendarEvent.ChildEvent childEvent0 = new edu.ksu.canvas.model.CalendarEvent.ChildEvent();
        java.lang.String str1 = childEvent0.getContextCode();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType importType4 = edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType.instructure_csv;
        java.io.InputStream inputStream6 = null;
        edu.ksu.canvas.requestOptions.CreateSisImportOptions createSisImportOptions9 = new edu.ksu.canvas.requestOptions.CreateSisImportOptions("submission_history", "total_scores", importType4, "", inputStream6, false, true);
        java.io.InputStream inputStream11 = null;
        edu.ksu.canvas.requestOptions.CreateSisImportOptions createSisImportOptions12 = new edu.ksu.canvas.requestOptions.CreateSisImportOptions("deleted", "conclude", importType4, "", inputStream11);
        org.junit.Assert.assertTrue("'" + importType4 + "' != '" + edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType.instructure_csv + "'", importType4.equals(edu.ksu.canvas.requestOptions.CreateSisImportOptions.ImportType.instructure_csv));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.CourseSettingsImpl courseSettingsImpl8 = new edu.ksu.canvas.impl.CourseSettingsImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, 0, 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.CourseSettings>> courseSettingsListConsumer9 = null;
        edu.ksu.canvas.interfaces.CourseSettingsReader courseSettingsReader10 = courseSettingsImpl8.withCallback(courseSettingsListConsumer9);
        edu.ksu.canvas.interfaces.CourseSettingsWriter courseSettingsWriter12 = courseSettingsImpl8.writeAsCanvasUser("submission_history");
        org.junit.Assert.assertNotNull(courseSettingsReader10);
        org.junit.Assert.assertNotNull(courseSettingsWriter12);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AccountImpl accountImpl8 = new edu.ksu.canvas.impl.AccountImpl("conclude/api/v1/course_progress", (java.lang.Integer) 100, oauthToken2, restClient3, 100, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Boolean) true);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.Account>> accountListConsumer9 = null;
        edu.ksu.canvas.interfaces.AccountReader accountReader10 = accountImpl8.withCallback(accountListConsumer9);
        org.junit.Assert.assertNotNull(accountReader10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        edu.ksu.canvas.requestOptions.UnEnrollOptions unEnrollOptions0 = edu.ksu.canvas.requestOptions.UnEnrollOptions.DEACTIVATE;
        java.lang.String str1 = unEnrollOptions0.toString();
        org.junit.Assert.assertTrue("'" + unEnrollOptions0 + "' != '" + edu.ksu.canvas.requestOptions.UnEnrollOptions.DEACTIVATE + "'", unEnrollOptions0.equals(edu.ksu.canvas.requestOptions.UnEnrollOptions.DEACTIVATE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "deactivate" + "'", str1, "deactivate");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        java.lang.Boolean boolean1 = course0.getAllowStudentWikiEdits();
        java.lang.Boolean boolean2 = course0.getHideFinalGrades();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AccountImpl accountImpl8 = new edu.ksu.canvas.impl.AccountImpl("conclude/api/v1/course_progress", (java.lang.Integer) 100, oauthToken2, restClient3, 100, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.AccountReader accountReader10 = accountImpl8.readAsCanvasUser("undated");
        edu.ksu.canvas.model.Account account11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.Account> accountOptional12 = accountImpl8.updateAccount(account11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountReader10);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include1 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES;
        assignment0.setIntegrationData((java.lang.Object) include1);
        java.util.Date date3 = assignment0.getLockAt();
        java.lang.Integer int4 = assignment0.getId();
        org.junit.Assert.assertTrue("'" + include1 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES + "'", include1.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES));
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.LoginImpl loginImpl8 = new edu.ksu.canvas.impl.LoginImpl("conclude", (java.lang.Integer) 0, oauthToken2, restClient3, 10, (int) (byte) 1, (java.lang.Integer) (-1), (java.lang.Boolean) true);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.Login>> loginListConsumer9 = null;
        edu.ksu.canvas.interfaces.LoginReader loginReader10 = loginImpl8.withCallback(loginListConsumer9);
        edu.ksu.canvas.interfaces.LoginReader loginReader12 = loginImpl8.readAsCanvasUser("undated");
        org.junit.Assert.assertNotNull(loginReader10);
        org.junit.Assert.assertNotNull(loginReader12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        long long0 = edu.ksu.canvas.model.GradingStandard.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("", (java.lang.Integer) (-1), oauthToken2, restClient3, (int) (short) 1, (int) '#', (java.lang.Integer) 0, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.MigrationIssue> migrationIssueOptional12 = migrationIssueImpl8.getUserMigrationIssue("deactivate", (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TERM;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TERM + "'", include0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TERM));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.SelectiveDataImpl selectiveDataImpl8 = new edu.ksu.canvas.impl.SelectiveDataImpl("", (java.lang.Integer) 10, oauthToken2, restClient3, 1, 100, (java.lang.Integer) 1, (java.lang.Boolean) true);
        edu.ksu.canvas.requestOptions.GetSelectiveDataOptions getSelectiveDataOptions12 = new edu.ksu.canvas.requestOptions.GetSelectiveDataOptions("conclude", (java.lang.Integer) 10, "course_progress");
        getSelectiveDataOptions12.setType("conclude");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.SelectiveData> selectiveDataList15 = selectiveDataImpl8.getCourseSelectiveDataFromMigration(getSelectiveDataOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        edu.ksu.canvas.errors.ErrorDetails errorDetails0 = new edu.ksu.canvas.errors.ErrorDetails();
        java.lang.String str1 = errorDetails0.getType();
        java.lang.String str2 = errorDetails0.getAttribute();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        edu.ksu.canvas.requestOptions.CompleteQuizSubmissionOptions completeQuizSubmissionOptions5 = new edu.ksu.canvas.requestOptions.CompleteQuizSubmissionOptions("course_progress", (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, "hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        edu.ksu.canvas.requestOptions.ListAccountAdminsOptions listAccountAdminsOptions1 = new edu.ksu.canvas.requestOptions.ListAccountAdminsOptions("conclude");
        java.lang.String[] strArray7 = new java.lang.String[] { "conclude", "hi!/api/v1/event", "total_scores", "conclude/api/v1/course_progress", "deleted" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        edu.ksu.canvas.requestOptions.ListAccountAdminsOptions listAccountAdminsOptions10 = listAccountAdminsOptions1.includes((java.util.List<java.lang.String>) strList8);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(listAccountAdminsOptions10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = assignment0.isOmitFromFinalGrade();
        java.lang.Boolean boolean4 = assignment0.isPublished();
        assignment0.setAutomaticPeerReviews((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.SelectiveDataImpl selectiveDataImpl8 = new edu.ksu.canvas.impl.SelectiveDataImpl("", (java.lang.Integer) 10, oauthToken2, restClient3, 1, 100, (java.lang.Integer) 1, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.SelectiveDataReader selectiveDataReader10 = selectiveDataImpl8.readAsCanvasUser("total_scores");
        edu.ksu.canvas.requestOptions.GetSelectiveDataOptions getSelectiveDataOptions14 = new edu.ksu.canvas.requestOptions.GetSelectiveDataOptions("conclude", (java.lang.Integer) 10, "course_progress");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.SelectiveData> selectiveDataList15 = selectiveDataReader10.getUserSelectiveDataFromMigration(getSelectiveDataOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(selectiveDataReader10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setIsPublic((java.lang.Boolean) false);
        java.lang.String str3 = course0.getTimeZone();
        course0.setLicense("total_scores");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include1 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES;
        assignment0.setIntegrationData((java.lang.Object) include1);
        java.util.Date date3 = assignment0.getLockAt();
        java.lang.Long long4 = assignment0.getAssignmentGroupId();
        java.lang.Long long5 = assignment0.getAssignmentGroupId();
        java.lang.Double double6 = assignment0.getPointsPossible();
        org.junit.Assert.assertTrue("'" + include1 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES + "'", include1.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES));
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(double6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        edu.ksu.canvas.requestOptions.GetSingleAssignmentOptions.Include include0 = edu.ksu.canvas.requestOptions.GetSingleAssignmentOptions.Include.SUBMISSION;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleAssignmentOptions.Include.SUBMISSION + "'", include0.equals(edu.ksu.canvas.requestOptions.GetSingleAssignmentOptions.Include.SUBMISSION));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include include0 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.CUSTOM_LINKS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.CUSTOM_LINKS + "'", include0.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.CUSTOM_LINKS));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        edu.ksu.canvas.model.AccountAdmin accountAdmin0 = new edu.ksu.canvas.model.AccountAdmin();
        accountAdmin0.setRole("event");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.oauth.OauthToken oauthToken5 = null;
        edu.ksu.canvas.net.SimpleRestClient simpleRestClient6 = new edu.ksu.canvas.net.SimpleRestClient();
        edu.ksu.canvas.impl.AssignmentOverrideImpl assignmentOverrideImpl11 = new edu.ksu.canvas.impl.AssignmentOverrideImpl("conclude", (java.lang.Integer) 1, oauthToken5, (edu.ksu.canvas.net.RestClient) simpleRestClient6, 0, 10, (java.lang.Integer) 1, (java.lang.Boolean) false);
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl16 = new edu.ksu.canvas.impl.AssignmentImpl("course_progress", (java.lang.Integer) 1, oauthToken2, (edu.ksu.canvas.net.RestClient) simpleRestClient6, (int) (byte) 0, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Boolean) false);
        edu.ksu.canvas.model.assignment.Assignment assignment18 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment18.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment18.setPointsPossible((java.lang.Double) 0.0d);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "undated", "deleted", "hi!", "undated", "hi!", "", "deleted", "submission_history", "deleted" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        assignment18.setSubmissionTypes((java.util.List<java.lang.String>) strList34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.assignment.Assignment> assignmentOptional37 = assignmentImpl16.createAssignment("course_progress", assignment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Assignment must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        edu.ksu.canvas.model.AccountAdmin accountAdmin0 = new edu.ksu.canvas.model.AccountAdmin();
        java.lang.Integer int1 = accountAdmin0.getRoleId();
        edu.ksu.canvas.model.User user2 = accountAdmin0.getUser();
        java.lang.String str3 = accountAdmin0.getRole();
        java.lang.String str4 = accountAdmin0.getWorkflowState();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        edu.ksu.canvas.model.CalendarEvent.ChildEvent childEvent0 = new edu.ksu.canvas.model.CalendarEvent.ChildEvent();
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions3 = new edu.ksu.canvas.requestOptions.CreateConversationOptions("", "course_progress");
        edu.ksu.canvas.requestOptions.CreateConversationOptions createConversationOptions5 = createConversationOptions3.groupConversation((java.lang.Boolean) true);
        boolean boolean6 = childEvent0.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(createConversationOptions5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.SimpleRestClient simpleRestClient3 = new edu.ksu.canvas.net.SimpleRestClient();
        edu.ksu.canvas.impl.AssignmentOverrideImpl assignmentOverrideImpl8 = new edu.ksu.canvas.impl.AssignmentOverrideImpl("conclude", (java.lang.Integer) 1, oauthToken2, (edu.ksu.canvas.net.RestClient) simpleRestClient3, 0, 10, (java.lang.Integer) 1, (java.lang.Boolean) false);
        edu.ksu.canvas.oauth.OauthToken oauthToken9 = null;
        edu.ksu.canvas.model.assignment.AssignmentGroup assignmentGroup11 = new edu.ksu.canvas.model.assignment.AssignmentGroup();
        java.lang.String str12 = assignmentGroup11.getSisSourceId();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = assignmentGroup11.toPostMap(false);
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.net.Response response17 = simpleRestClient3.sendApiDelete(oauthToken9, "deactivate", strMap14, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        edu.ksu.canvas.model.AccountAdmin accountAdmin0 = new edu.ksu.canvas.model.AccountAdmin();
        edu.ksu.canvas.model.User user1 = accountAdmin0.getUser();
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RefreshingRestClient refreshingRestClient3 = new edu.ksu.canvas.net.RefreshingRestClient();
        edu.ksu.canvas.impl.AssignmentOverrideImpl assignmentOverrideImpl8 = new edu.ksu.canvas.impl.AssignmentOverrideImpl("total_students", (java.lang.Integer) 100, oauthToken2, (edu.ksu.canvas.net.RestClient) refreshingRestClient3, (int) (short) 100, (int) (byte) 100, (java.lang.Integer) 100, (java.lang.Boolean) false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ContentMigrationWriter contentMigrationWriter10 = contentMigrationImpl8.writeAsSisUser("");
        edu.ksu.canvas.requestOptions.CreateContentMigrationOptions createContentMigrationOptions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional13 = contentMigrationImpl8.createAccountContentMigration("UTF-8", createContentMigrationOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentMigrationWriter10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        edu.ksu.canvas.requestOptions.GetSelectiveDataOptions getSelectiveDataOptions3 = new edu.ksu.canvas.requestOptions.GetSelectiveDataOptions("conclude", (java.lang.Integer) 100, "ta");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        edu.ksu.canvas.model.Enrollment enrollment0 = new edu.ksu.canvas.model.Enrollment();
        enrollment0.setUserId("");
        edu.ksu.canvas.model.User user3 = null;
        enrollment0.setUser(user3);
        enrollment0.setSisImportId("deactivate");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        edu.ksu.canvas.model.Enrollment enrollment0 = new edu.ksu.canvas.model.Enrollment();
        enrollment0.setUserId("");
        edu.ksu.canvas.model.User user3 = null;
        enrollment0.setUser(user3);
        enrollment0.setSisImportId("student");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.OBSERVED_USERS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.OBSERVED_USERS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.Include.OBSERVED_USERS));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment0.setPointsPossible((java.lang.Double) 0.0d);
        java.lang.String str5 = assignment0.getIntegrationId();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        edu.ksu.canvas.model.SisImport sisImport0 = new edu.ksu.canvas.model.SisImport();
        java.lang.Integer int1 = sisImport0.getChangeThreshold();
        java.util.List<java.util.List<java.lang.String>> strListList2 = sisImport0.getProcessingWarnings();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(strListList2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ContentMigrationWriter contentMigrationWriter10 = contentMigrationImpl8.writeAsCanvasUser("hi!/api/v1/event");
        edu.ksu.canvas.interfaces.ContentMigrationReader contentMigrationReader12 = contentMigrationImpl8.readAsCanvasUser("hi!");
        org.junit.Assert.assertNotNull(contentMigrationWriter10);
        org.junit.Assert.assertNotNull(contentMigrationReader12);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RefreshingRestClient refreshingRestClient3 = new edu.ksu.canvas.net.RefreshingRestClient();
        edu.ksu.canvas.impl.AuthenticationLogImpl authenticationLogImpl8 = new edu.ksu.canvas.impl.AuthenticationLogImpl("submission_history", (java.lang.Integer) 0, oauthToken2, (edu.ksu.canvas.net.RestClient) refreshingRestClient3, (int) (short) -1, (int) (byte) 1, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.AuthenticationLogReader authenticationLogReader10 = authenticationLogImpl8.readAsCanvasUser("student");
        org.junit.Assert.assertNotNull(authenticationLogReader10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        edu.ksu.canvas.model.report.AccountReportAttachment accountReportAttachment0 = new edu.ksu.canvas.model.report.AccountReportAttachment();
        java.net.URI uRI1 = null;
        accountReportAttachment0.setUrl(uRI1);
        java.lang.String str3 = accountReportAttachment0.getFilename();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.QuizImpl quizImpl8 = new edu.ksu.canvas.impl.QuizImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 10, 100, (java.lang.Integer) 10, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.QuizWriter quizWriter10 = quizImpl8.writeAsCanvasUser("");
        edu.ksu.canvas.interfaces.QuizWriter quizWriter12 = quizImpl8.writeAsSisUser("");
        org.junit.Assert.assertNotNull(quizWriter10);
        org.junit.Assert.assertNotNull(quizWriter12);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.LoginImpl loginImpl8 = new edu.ksu.canvas.impl.LoginImpl("conclude", (java.lang.Integer) 0, oauthToken2, restClient3, 10, (int) (byte) 1, (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.LoginWriter loginWriter10 = loginImpl8.writeAsCanvasUser("course_progress");
        edu.ksu.canvas.interfaces.LoginReader loginReader12 = loginImpl8.readAsCanvasUser("total_scores");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<edu.ksu.canvas.model.Login> loginList14 = loginImpl8.getLoginForUser("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loginWriter10);
        org.junit.Assert.assertNotNull(loginReader12);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        edu.ksu.canvas.requestOptions.GetSingleConversationOptions.FilterMode filterMode0 = edu.ksu.canvas.requestOptions.GetSingleConversationOptions.FilterMode.AND;
        java.lang.String str1 = filterMode0.toString();
        org.junit.Assert.assertTrue("'" + filterMode0 + "' != '" + edu.ksu.canvas.requestOptions.GetSingleConversationOptions.FilterMode.AND + "'", filterMode0.equals(edu.ksu.canvas.requestOptions.GetSingleConversationOptions.FilterMode.AND));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "and" + "'", str1, "and");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ProgressImpl progressImpl8 = new edu.ksu.canvas.impl.ProgressImpl("", (java.lang.Integer) 100, oauthToken2, restClient3, 1, (int) (byte) 100, (java.lang.Integer) 100, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ProgressWriter progressWriter10 = progressImpl8.writeAsCanvasUser("conclude/api/v1/course_progress");
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.Progress>> progressListConsumer11 = null;
        edu.ksu.canvas.interfaces.ProgressReader progressReader12 = progressImpl8.withCallback(progressListConsumer11);
        org.junit.Assert.assertNotNull(progressWriter10);
        org.junit.Assert.assertNotNull(progressReader12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        edu.ksu.canvas.requestOptions.AnswerQuizQuestionOptions answerQuizQuestionOptions3 = new edu.ksu.canvas.requestOptions.AnswerQuizQuestionOptions((java.lang.Integer) 1, (java.lang.Integer) 10, "student");
        edu.ksu.canvas.requestOptions.AnswerQuizQuestionOptions answerQuizQuestionOptions5 = answerQuizQuestionOptions3.accessCode("total_scores");
        org.junit.Assert.assertNotNull(answerQuizQuestionOptions5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.EnrollmentTermImpl enrollmentTermImpl8 = new edu.ksu.canvas.impl.EnrollmentTermImpl("conclude", (java.lang.Integer) 1, oauthToken2, restClient3, (int) 'a', 1, (java.lang.Integer) 10, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.EnrollmentTermReader enrollmentTermReader10 = enrollmentTermImpl8.readAsCanvasUser("");
        edu.ksu.canvas.interfaces.EnrollmentTermReader enrollmentTermReader12 = enrollmentTermImpl8.readAsCanvasUser("");
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.EnrollmentTerm>> enrollmentTermListConsumer13 = null;
        edu.ksu.canvas.interfaces.EnrollmentTermReader enrollmentTermReader14 = enrollmentTermImpl8.withCallback(enrollmentTermListConsumer13);
        edu.ksu.canvas.interfaces.EnrollmentTermWriter enrollmentTermWriter16 = enrollmentTermImpl8.writeAsCanvasUser("course_progress");
        org.junit.Assert.assertNotNull(enrollmentTermReader10);
        org.junit.Assert.assertNotNull(enrollmentTermReader12);
        org.junit.Assert.assertNotNull(enrollmentTermReader14);
        org.junit.Assert.assertNotNull(enrollmentTermWriter16);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.CURRENT_GRADING_PERIOD_SCORES;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.CURRENT_GRADING_PERIOD_SCORES + "'", include0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.CURRENT_GRADING_PERIOD_SCORES));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.STUDENT;
        java.lang.String str1 = enrollmentType0.toString();
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.STUDENT + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.ListActiveCoursesInAccountOptions.EnrollmentType.STUDENT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "student" + "'", str1, "student");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions2 = new edu.ksu.canvas.requestOptions.AccountReportOptions("undated", "conclude");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions4 = accountReportOptions2.sections("");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions6 = accountReportOptions2.groupMembership("conclude/api/v1/course_progress");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions8 = accountReportOptions2.includeDeleted("event");
        org.junit.Assert.assertNotNull(accountReportOptions4);
        org.junit.Assert.assertNotNull(accountReportOptions6);
        org.junit.Assert.assertNotNull(accountReportOptions8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.SimpleRestClient simpleRestClient3 = new edu.ksu.canvas.net.SimpleRestClient();
        edu.ksu.canvas.impl.AuthenticationLogImpl authenticationLogImpl8 = new edu.ksu.canvas.impl.AuthenticationLogImpl("student", (java.lang.Integer) 1, oauthToken2, (edu.ksu.canvas.net.RestClient) simpleRestClient3, (-1), (int) (short) 10, (java.lang.Integer) 10, (java.lang.Boolean) true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setOffer((java.lang.Boolean) true);
        java.util.Date date5 = course0.getEndAt();
        course0.setTimeZone("student");
        java.util.List<edu.ksu.canvas.model.UserDisplay> userDisplayList8 = null;
        course0.setTeachers(userDisplayList8);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        edu.ksu.canvas.model.Enrollment enrollment0 = new edu.ksu.canvas.model.Enrollment();
        edu.ksu.canvas.model.User user1 = new edu.ksu.canvas.model.User();
        java.time.Instant instant2 = null;
        user1.setCreatedAt(instant2);
        enrollment0.setUser(user1);
        java.time.Instant instant5 = user1.getCreatedAt();
        org.junit.Assert.assertNull(instant5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.QuizImpl quizImpl8 = new edu.ksu.canvas.impl.QuizImpl("hi!", (java.lang.Integer) 0, oauthToken2, restClient3, (int) (byte) 10, 100, (java.lang.Integer) 10, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.QuizWriter quizWriter10 = quizImpl8.writeAsCanvasUser("");
        edu.ksu.canvas.interfaces.QuizReader quizReader12 = quizImpl8.readAsCanvasUser("conclude");
        edu.ksu.canvas.interfaces.QuizReader quizReader14 = quizImpl8.readAsCanvasUser("and");
        org.junit.Assert.assertNotNull(quizWriter10);
        org.junit.Assert.assertNotNull(quizReader12);
        org.junit.Assert.assertNotNull(quizReader14);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment0.setPointsPossible((java.lang.Double) 0.0d);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "undated", "deleted", "hi!", "undated", "hi!", "", "deleted", "submission_history", "deleted" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        assignment0.setSubmissionTypes((java.util.List<java.lang.String>) strList16);
        assignment0.setNeedsGradingCount((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        edu.ksu.canvas.errors.UserErrorResponse.Errors errors0 = new edu.ksu.canvas.errors.UserErrorResponse.Errors();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AccountImpl accountImpl8 = new edu.ksu.canvas.impl.AccountImpl("conclude/api/v1/course_progress", (java.lang.Integer) 100, oauthToken2, restClient3, 100, (int) (short) 1, (java.lang.Integer) 100, (java.lang.Boolean) true);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.Account>> accountListConsumer9 = null;
        edu.ksu.canvas.interfaces.AccountReader accountReader10 = accountImpl8.withCallback(accountListConsumer9);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.Account>> accountListConsumer11 = null;
        edu.ksu.canvas.interfaces.AccountReader accountReader12 = accountImpl8.withCallback(accountListConsumer11);
        edu.ksu.canvas.interfaces.AccountReader accountReader14 = accountReader12.readAsSisUser("and");
        org.junit.Assert.assertNotNull(accountReader10);
        org.junit.Assert.assertNotNull(accountReader12);
        org.junit.Assert.assertNotNull(accountReader14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = assignment0.isOmitFromFinalGrade();
        java.lang.Boolean boolean4 = assignment0.isPublished();
        assignment0.setPublished((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = assignment0.getTurnitinEnabled();
        assignment0.setPeerReviews((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        edu.ksu.canvas.model.SisImport sisImport0 = new edu.ksu.canvas.model.SisImport();
        sisImport0.setBatchModeTermId("submission_history");
        sisImport0.setDiffingDropStatus("UTF-8");
        sisImport0.setChangeThreshold((java.lang.Integer) 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        edu.ksu.canvas.model.Enrollment enrollment0 = new edu.ksu.canvas.model.Enrollment();
        enrollment0.setUserId("");
        java.util.Date date3 = null;
        enrollment0.setLastActivityAt(date3);
        enrollment0.setId((-1L));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.SimpleRestClient simpleRestClient3 = new edu.ksu.canvas.net.SimpleRestClient();
        edu.ksu.canvas.impl.AssignmentOverrideImpl assignmentOverrideImpl8 = new edu.ksu.canvas.impl.AssignmentOverrideImpl("conclude", (java.lang.Integer) 1, oauthToken2, (edu.ksu.canvas.net.RestClient) simpleRestClient3, 0, 10, (java.lang.Integer) 1, (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.AssignmentOverrideWriter assignmentOverrideWriter10 = assignmentOverrideImpl8.writeAsCanvasUser("total_students");
        org.junit.Assert.assertNotNull(assignmentOverrideWriter10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment0.setPointsPossible((java.lang.Double) 0.0d);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "undated", "deleted", "hi!", "undated", "hi!", "", "deleted", "submission_history", "deleted" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        assignment0.setSubmissionTypes((java.util.List<java.lang.String>) strList16);
        java.lang.Boolean boolean19 = assignment0.isPublished();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        edu.ksu.canvas.CanvasApiFactory canvasApiFactory1 = new edu.ksu.canvas.CanvasApiFactory("student");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        edu.ksu.canvas.model.SisImport sisImport0 = new edu.ksu.canvas.model.SisImport();
        sisImport0.setBatchModeTermId("submission_history");
        edu.ksu.canvas.model.sisimport.SisImportErrorsAttachment sisImportErrorsAttachment3 = null;
        sisImport0.setErrorsAttachment(sisImportErrorsAttachment3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTermId("total_students");
        java.lang.String str3 = course0.getIntegrationId();
        java.lang.Boolean boolean4 = course0.getOffer();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        edu.ksu.canvas.model.AuthenticationLog authenticationLog0 = new edu.ksu.canvas.model.AuthenticationLog();
        java.util.List<edu.ksu.canvas.model.AuthenticationLog.AuthenticationEvent> authenticationEventList1 = authenticationLog0.getEvents();
        org.junit.Assert.assertNull(authenticationEventList1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include0 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.COURSE_PROGRESS;
        org.junit.Assert.assertTrue("'" + include0 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.COURSE_PROGRESS + "'", include0.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.COURSE_PROGRESS));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.oauth.OauthToken oauthToken5 = null;
        edu.ksu.canvas.net.RefreshingRestClient refreshingRestClient6 = new edu.ksu.canvas.net.RefreshingRestClient();
        edu.ksu.canvas.impl.AuthenticationLogImpl authenticationLogImpl11 = new edu.ksu.canvas.impl.AuthenticationLogImpl("submission_history", (java.lang.Integer) 0, oauthToken5, (edu.ksu.canvas.net.RestClient) refreshingRestClient6, (int) (short) -1, (int) (byte) 1, (java.lang.Integer) 10, (java.lang.Boolean) true);
        edu.ksu.canvas.impl.AccountReportSummaryImpl accountReportSummaryImpl16 = new edu.ksu.canvas.impl.AccountReportSummaryImpl("deleted", (java.lang.Integer) 0, oauthToken2, (edu.ksu.canvas.net.RestClient) refreshingRestClient6, 1, (int) (byte) 100, (java.lang.Integer) 0, (java.lang.Boolean) false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        edu.ksu.canvas.requestOptions.DeleteAssignmentGroupOptions deleteAssignmentGroupOptions2 = new edu.ksu.canvas.requestOptions.DeleteAssignmentGroupOptions("UTF-8", (java.lang.Integer) 1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.oauth.OauthToken oauthToken5 = null;
        edu.ksu.canvas.oauth.OauthToken oauthToken8 = null;
        edu.ksu.canvas.net.SimpleRestClient simpleRestClient9 = new edu.ksu.canvas.net.SimpleRestClient();
        edu.ksu.canvas.impl.AssignmentOverrideImpl assignmentOverrideImpl14 = new edu.ksu.canvas.impl.AssignmentOverrideImpl("conclude", (java.lang.Integer) 1, oauthToken8, (edu.ksu.canvas.net.RestClient) simpleRestClient9, 0, 10, (java.lang.Integer) 1, (java.lang.Boolean) false);
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl19 = new edu.ksu.canvas.impl.AssignmentImpl("course_progress", (java.lang.Integer) 1, oauthToken5, (edu.ksu.canvas.net.RestClient) simpleRestClient9, (int) (byte) 0, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Boolean) false);
        edu.ksu.canvas.impl.CalendarEventImpl calendarEventImpl24 = new edu.ksu.canvas.impl.CalendarEventImpl("submission_history", (java.lang.Integer) 100, oauthToken2, (edu.ksu.canvas.net.RestClient) simpleRestClient9, 100, (int) (byte) 1, (java.lang.Integer) 1, (java.lang.Boolean) false);
        edu.ksu.canvas.model.CalendarEvent calendarEvent25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.CalendarEvent> calendarEventOptional26 = calendarEventImpl24.editCalendarEvent(calendarEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        edu.ksu.canvas.model.Page page0 = new edu.ksu.canvas.model.Page();
        java.util.Date date1 = page0.getCreatedAt();
        java.lang.String str2 = page0.getEditingRoles();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentType.STUDENTVIEW;
        java.lang.String str1 = enrollmentType0.toString();
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentType.STUDENTVIEW + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.GetEnrollmentOptions.EnrollmentType.STUDENTVIEW));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "StudentViewEnrollment" + "'", str1, "StudentViewEnrollment");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        edu.ksu.canvas.model.Conversation.ConversationMessageState conversationMessageState0 = edu.ksu.canvas.model.Conversation.ConversationMessageState.archived;
        org.junit.Assert.assertTrue("'" + conversationMessageState0 + "' != '" + edu.ksu.canvas.model.Conversation.ConversationMessageState.archived + "'", conversationMessageState0.equals(edu.ksu.canvas.model.Conversation.ConversationMessageState.archived));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AssignmentImpl assignmentImpl8 = new edu.ksu.canvas.impl.AssignmentImpl("", (java.lang.Integer) 1, oauthToken2, restClient3, (int) ' ', (int) (short) -1, (java.lang.Integer) 100, (java.lang.Boolean) false);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.assignment.Assignment>> assignmentListConsumer9 = null;
        edu.ksu.canvas.interfaces.AssignmentReader assignmentReader10 = assignmentImpl8.withCallback(assignmentListConsumer9);
        java.util.function.Consumer<java.util.List<edu.ksu.canvas.model.assignment.Assignment>> assignmentListConsumer11 = null;
        edu.ksu.canvas.interfaces.AssignmentReader assignmentReader12 = assignmentReader10.withCallback(assignmentListConsumer11);
        org.junit.Assert.assertNotNull(assignmentReader10);
        org.junit.Assert.assertNotNull(assignmentReader12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        edu.ksu.canvas.requestOptions.ListRolesOptions.State state0 = edu.ksu.canvas.requestOptions.ListRolesOptions.State.INACTIVE;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + edu.ksu.canvas.requestOptions.ListRolesOptions.State.INACTIVE + "'", state0.equals(edu.ksu.canvas.requestOptions.ListRolesOptions.State.INACTIVE));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        edu.ksu.canvas.requestOptions.ListCalendarEventsOptions listCalendarEventsOptions0 = new edu.ksu.canvas.requestOptions.ListCalendarEventsOptions();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.EnrollmentType enrollmentType0 = edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.EnrollmentType.STUDENT;
        org.junit.Assert.assertTrue("'" + enrollmentType0 + "' != '" + edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.EnrollmentType.STUDENT + "'", enrollmentType0.equals(edu.ksu.canvas.requestOptions.ListCurrentUserCoursesOptions.EnrollmentType.STUDENT));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions multipleSubmissionsOptions0 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions.StudentSubmissionOption studentSubmissionOption7 = multipleSubmissionsOptions0.new StudentSubmissionOption("deleted", "", (java.lang.Boolean) false, (java.lang.Boolean) false, "student", "event");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions$StudentSubmissionOption with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.AccountReportImpl accountReportImpl8 = new edu.ksu.canvas.impl.AccountReportImpl("", (java.lang.Integer) 10, oauthToken2, restClient3, (int) (byte) -1, (int) (short) 10, (java.lang.Integer) (-1), (java.lang.Boolean) false);
        edu.ksu.canvas.interfaces.AccountReportReader accountReportReader10 = accountReportImpl8.readAsCanvasUser("");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions13 = new edu.ksu.canvas.requestOptions.AccountReportOptions("undated", "conclude");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions15 = accountReportOptions13.users("undated");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.report.AccountReport> accountReportOptional16 = accountReportImpl8.startReport(accountReportOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountReportReader10);
        org.junit.Assert.assertNotNull(accountReportOptions15);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setOffer((java.lang.Boolean) true);
        java.util.Date date5 = course0.getEndAt();
        course0.setTimeZone("student");
        course0.setCourseCode("UTF-8");
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.MigrationIssueImpl migrationIssueImpl8 = new edu.ksu.canvas.impl.MigrationIssueImpl("course_progress", (java.lang.Integer) 1, oauthToken2, restClient3, (int) (byte) -1, (int) (byte) 1, (java.lang.Integer) 0, (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.CanvasWriter canvasWriter10 = migrationIssueImpl8.writeAsCanvasUser("conclude");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.MigrationIssue> migrationIssueOptional14 = migrationIssueImpl8.getUserMigrationIssue("total_students", (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(canvasWriter10);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        java.lang.String str3 = course0.getImageUrl();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions1 = new edu.ksu.canvas.requestOptions.GetUsersInCourseOptions("key");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions3 = getUsersInCourseOptions1.enrollmentRoleId((java.lang.Integer) (-1));
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include include4 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED;
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include include5 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.EMAIL;
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include include6 = edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED;
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include[] includeArray7 = new edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include[] { include4, include5, include6 };
        java.util.ArrayList<edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include> includeList8 = new java.util.ArrayList<edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include>) includeList8, includeArray7);
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions10 = getUsersInCourseOptions3.include((java.util.List<edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include>) includeList8);
        org.junit.Assert.assertNotNull(getUsersInCourseOptions3);
        org.junit.Assert.assertTrue("'" + include4 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED + "'", include4.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED));
        org.junit.Assert.assertTrue("'" + include5 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.EMAIL + "'", include5.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.EMAIL));
        org.junit.Assert.assertTrue("'" + include6 + "' != '" + edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED + "'", include6.equals(edu.ksu.canvas.requestOptions.GetUsersInCourseOptions.Include.LOCKED));
        org.junit.Assert.assertNotNull(includeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(getUsersInCourseOptions10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include include1 = edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES;
        assignment0.setIntegrationData((java.lang.Object) include1);
        assignment0.setTurnitinEnabled((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + include1 + "' != '" + edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES + "'", include1.equals(edu.ksu.canvas.requestOptions.ListUserCoursesOptions.Include.TOTAL_SCORES));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        edu.ksu.canvas.model.AccountAdmin accountAdmin0 = new edu.ksu.canvas.model.AccountAdmin();
        java.lang.Integer int1 = accountAdmin0.getRoleId();
        edu.ksu.canvas.model.User user2 = accountAdmin0.getUser();
        java.lang.String str3 = accountAdmin0.getWorkflowState();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        edu.ksu.canvas.model.CalendarEvent.Frequency frequency0 = edu.ksu.canvas.model.CalendarEvent.Frequency.WEEKLY;
        org.junit.Assert.assertTrue("'" + frequency0 + "' != '" + edu.ksu.canvas.model.CalendarEvent.Frequency.WEEKLY + "'", frequency0.equals(edu.ksu.canvas.model.CalendarEvent.Frequency.WEEKLY));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        edu.ksu.canvas.model.Course course0 = new edu.ksu.canvas.model.Course();
        course0.setTotalStudents((java.lang.Integer) 0);
        course0.setOffer((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = course0.getAllowStudentForumAttachments();
        course0.setSelfEnrollment((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.LoginImpl loginImpl8 = new edu.ksu.canvas.impl.LoginImpl("conclude", (java.lang.Integer) 0, oauthToken2, restClient3, 10, (int) (byte) 1, (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.LoginWriter loginWriter10 = loginImpl8.writeAsCanvasUser("course_progress");
        edu.ksu.canvas.interfaces.LoginWriter loginWriter12 = loginImpl8.writeAsCanvasUser("hi!");
        edu.ksu.canvas.model.Login login13 = null;
        edu.ksu.canvas.requestOptions.CreateLoginOptions createLoginOptions14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.Login> loginOptional15 = loginImpl8.createLogin(login13, createLoginOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loginWriter10);
        org.junit.Assert.assertNotNull(loginWriter12);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        edu.ksu.canvas.oauth.OauthToken oauthToken2 = null;
        edu.ksu.canvas.net.RestClient restClient3 = null;
        edu.ksu.canvas.impl.ContentMigrationImpl contentMigrationImpl8 = new edu.ksu.canvas.impl.ContentMigrationImpl("hi!", (java.lang.Integer) 100, oauthToken2, restClient3, (int) (byte) -1, (int) '#', (java.lang.Integer) (-1), (java.lang.Boolean) true);
        edu.ksu.canvas.interfaces.ContentMigrationWriter contentMigrationWriter10 = contentMigrationImpl8.writeAsCanvasUser("hi!/api/v1/event");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<edu.ksu.canvas.model.ContentMigration> contentMigrationOptional13 = contentMigrationImpl8.getUserContentMigration("hi!", (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentMigrationWriter10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions1 = new edu.ksu.canvas.requestOptions.GetUsersInCourseOptions("key");
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions3 = getUsersInCourseOptions1.enrollmentRoleId((java.lang.Integer) (-1));
        edu.ksu.canvas.model.assignment.Assignment assignment4 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment4.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment4.setPointsPossible((java.lang.Double) 0.0d);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "undated", "deleted", "hi!", "undated", "hi!", "", "deleted", "submission_history", "deleted" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        assignment4.setSubmissionTypes((java.util.List<java.lang.String>) strList20);
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions23 = getUsersInCourseOptions1.userIds((java.util.List<java.lang.String>) strList20);
        edu.ksu.canvas.requestOptions.GetUsersInCourseOptions getUsersInCourseOptions25 = getUsersInCourseOptions1.searchTerm("submission_history");
        org.junit.Assert.assertNotNull(getUsersInCourseOptions3);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(getUsersInCourseOptions23);
        org.junit.Assert.assertNotNull(getUsersInCourseOptions25);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        edu.ksu.canvas.model.assignment.Assignment assignment0 = new edu.ksu.canvas.model.assignment.Assignment();
        assignment0.setOnlyVisibleToOverrides((java.lang.Boolean) true);
        assignment0.setPointsPossible((java.lang.Double) 0.0d);
        java.util.Date date5 = null;
        assignment0.setUpdatedAt(date5);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions2 = new edu.ksu.canvas.requestOptions.AccountReportOptions("undated", "conclude");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions4 = accountReportOptions2.sections("");
        edu.ksu.canvas.requestOptions.AccountReportOptions accountReportOptions6 = accountReportOptions2.xlist("total_scores");
        org.junit.Assert.assertNotNull(accountReportOptions4);
        org.junit.Assert.assertNotNull(accountReportOptions6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        edu.ksu.canvas.model.AccountAdmin accountAdmin0 = new edu.ksu.canvas.model.AccountAdmin();
        java.lang.Integer int1 = accountAdmin0.getId();
        edu.ksu.canvas.model.User user2 = accountAdmin0.getUser();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(user2);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions listCourseAssignmentsOptions1 = new edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions("undated");
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions listCourseAssignmentsOptions3 = listCourseAssignmentsOptions1.needsGradingCountBySection((java.lang.Boolean) true);
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket bucket4 = edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.UNDATED;
        java.lang.String str5 = bucket4.toString();
        edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions listCourseAssignmentsOptions6 = listCourseAssignmentsOptions3.bucketFilter(bucket4);
        org.junit.Assert.assertNotNull(listCourseAssignmentsOptions3);
        org.junit.Assert.assertTrue("'" + bucket4 + "' != '" + edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.UNDATED + "'", bucket4.equals(edu.ksu.canvas.requestOptions.ListCourseAssignmentsOptions.Bucket.UNDATED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "undated" + "'", str5, "undated");
        org.junit.Assert.assertNotNull(listCourseAssignmentsOptions6);
    }
}

