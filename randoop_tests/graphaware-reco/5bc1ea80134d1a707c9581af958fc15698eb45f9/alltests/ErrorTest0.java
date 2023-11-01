import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.graphaware.reco.generic.result.Score score0 = new com.graphaware.reco.generic.result.Score();
        com.graphaware.reco.generic.util.Assert.notNull((java.lang.Object) score0, "");
        com.graphaware.reco.generic.result.Score score3 = new com.graphaware.reco.generic.result.Score();
        score0.add(score3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on score0 and score3", (score0.compareTo(score3) == 0) == score0.equals(score3));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.graphaware.reco.generic.result.Score score0 = new com.graphaware.reco.generic.result.Score();
        score0.add("hi!", 0.0f);
        com.graphaware.reco.generic.result.Score score4 = new com.graphaware.reco.generic.result.Score();
        score4.add("hi!", 0.0f);
        java.util.Map<java.lang.String, com.graphaware.reco.generic.result.PartialScore> strMap8 = score4.getScoreParts();
        score4.add("10.0", (float) 1L);
        score0.add(score4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on score0 and score4", (score0.compareTo(score4) == 0) == score0.equals(score4));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations0 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int1 = participationPolicyParetoScoreTransformerRecommendations0.size();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer5 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation6 = participationPolicyParetoScoreTransformerRecommendations0.getOrCreate(participationPolicyParetoScoreTransformer5);
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations7 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer11 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        participationPolicyParetoScoreTransformerRecommendations7.add(participationPolicyParetoScoreTransformer11, "hi!", (float) 10);
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations15 = participationPolicyParetoScoreTransformerRecommendations0.merge(participationPolicyParetoScoreTransformerRecommendations7);
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations16 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int17 = participationPolicyParetoScoreTransformerRecommendations16.size();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer21 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation22 = participationPolicyParetoScoreTransformerRecommendations16.getOrCreate(participationPolicyParetoScoreTransformer21);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        participationPolicyParetoScoreTransformerRecommendations15.add(participationPolicyParetoScoreTransformer21, "filtered items", 0.0f, strMap25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on participationPolicyParetoScoreTransformerRecommendation6 and participationPolicyParetoScoreTransformerRecommendation22", (participationPolicyParetoScoreTransformerRecommendation6.compareTo(participationPolicyParetoScoreTransformerRecommendation22) == 0) == participationPolicyParetoScoreTransformerRecommendation6.equals(participationPolicyParetoScoreTransformerRecommendation22));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations0 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int1 = participationPolicyParetoScoreTransformerRecommendations0.size();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer5 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation6 = participationPolicyParetoScoreTransformerRecommendations0.getOrCreate(participationPolicyParetoScoreTransformer5);
        com.graphaware.reco.generic.result.Score score7 = participationPolicyParetoScoreTransformerRecommendation6.getScore();
        com.graphaware.reco.generic.result.Score score8 = participationPolicyParetoScoreTransformerRecommendation6.getScore();
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations9 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int10 = participationPolicyParetoScoreTransformerRecommendations9.size();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer14 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation15 = participationPolicyParetoScoreTransformerRecommendations9.getOrCreate(participationPolicyParetoScoreTransformer14);
        int int16 = participationPolicyParetoScoreTransformerRecommendation6.compareTo(participationPolicyParetoScoreTransformerRecommendation15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on participationPolicyParetoScoreTransformerRecommendation6 and participationPolicyParetoScoreTransformerRecommendation15", (participationPolicyParetoScoreTransformerRecommendation6.compareTo(participationPolicyParetoScoreTransformerRecommendation15) == 0) == participationPolicyParetoScoreTransformerRecommendation6.equals(participationPolicyParetoScoreTransformerRecommendation15));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations0 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int1 = participationPolicyParetoScoreTransformerRecommendations0.size();
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations2 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer6 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        participationPolicyParetoScoreTransformerRecommendations2.add(participationPolicyParetoScoreTransformer6, "hi!", (float) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        participationPolicyParetoScoreTransformerRecommendations0.add(participationPolicyParetoScoreTransformer6, "hi!", (float) 10, strMap12);
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations14 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int15 = participationPolicyParetoScoreTransformerRecommendations14.size();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer19 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation20 = participationPolicyParetoScoreTransformerRecommendations14.getOrCreate(participationPolicyParetoScoreTransformer19);
        com.graphaware.reco.generic.result.Score score21 = new com.graphaware.reco.generic.result.Score();
        score21.add("hi!", 0.0f);
        participationPolicyParetoScoreTransformerRecommendations0.add(participationPolicyParetoScoreTransformer19, score21);
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer28 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) 0, 1.0f);
        participationPolicyParetoScoreTransformerRecommendations0.add(participationPolicyParetoScoreTransformer28, "candidate items", (float) (short) 1);
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer35 = com.graphaware.reco.generic.transform.ParetoScoreTransformer.create((float) (byte) -1, (float) (-1L), (float) 97);
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation36 = participationPolicyParetoScoreTransformerRecommendations0.getOrCreate(participationPolicyParetoScoreTransformer35);
        boolean boolean38 = participationPolicyParetoScoreTransformerRecommendations0.hasEnoughResults((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on participationPolicyParetoScoreTransformerRecommendation20 and participationPolicyParetoScoreTransformerRecommendation36", (participationPolicyParetoScoreTransformerRecommendation20.compareTo(participationPolicyParetoScoreTransformerRecommendation36) == 0) == participationPolicyParetoScoreTransformerRecommendation20.equals(participationPolicyParetoScoreTransformerRecommendation36));
    }
}

