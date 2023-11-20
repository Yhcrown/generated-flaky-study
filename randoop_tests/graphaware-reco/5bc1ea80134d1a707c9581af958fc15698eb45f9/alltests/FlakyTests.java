import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test247_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations0 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int1 = participationPolicyParetoScoreTransformerRecommendations0.size();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer5 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation6 = participationPolicyParetoScoreTransformerRecommendations0.getOrCreate(participationPolicyParetoScoreTransformer5);
        com.graphaware.reco.generic.result.Score score7 = participationPolicyParetoScoreTransformerRecommendation6.getScore();
        java.lang.String str8 = participationPolicyParetoScoreTransformerRecommendation6.getUuid();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer9 = participationPolicyParetoScoreTransformerRecommendation6.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(participationPolicyParetoScoreTransformerRecommendation6);
        org.junit.Assert.assertNotNull(score7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "e5c2912d-b85c-4f94-b2f2-d1e30a3a8bb7" + "'", str8, "e5c2912d-b85c-4f94-b2f2-d1e30a3a8bb7");
        org.junit.Assert.assertNotNull(participationPolicyParetoScoreTransformer9);
    }

    public void test273_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations0 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int1 = participationPolicyParetoScoreTransformerRecommendations0.size();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer5 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation6 = participationPolicyParetoScoreTransformerRecommendations0.getOrCreate(participationPolicyParetoScoreTransformer5);
        com.graphaware.reco.generic.result.Score score7 = participationPolicyParetoScoreTransformerRecommendation6.getScore();
        participationPolicyParetoScoreTransformerRecommendation6.add("total time", (float) 9);
        com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendations11 = new com.graphaware.reco.generic.result.Recommendations<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>>();
        int int12 = participationPolicyParetoScoreTransformerRecommendations11.size();
        com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy> participationPolicyParetoScoreTransformer16 = new com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>((float) (short) 1, 0.0f, (float) 'a');
        com.graphaware.reco.generic.result.Recommendation<com.graphaware.reco.generic.transform.ParetoScoreTransformer<com.graphaware.reco.generic.policy.ParticipationPolicy>> participationPolicyParetoScoreTransformerRecommendation17 = participationPolicyParetoScoreTransformerRecommendations11.getOrCreate(participationPolicyParetoScoreTransformer16);
        com.graphaware.reco.generic.result.Score score18 = participationPolicyParetoScoreTransformerRecommendation17.getScore();
        java.lang.String str19 = participationPolicyParetoScoreTransformerRecommendation17.getUuid();
        int int20 = participationPolicyParetoScoreTransformerRecommendation6.compareTo(participationPolicyParetoScoreTransformerRecommendation17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(participationPolicyParetoScoreTransformerRecommendation6);
        org.junit.Assert.assertNotNull(score7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(participationPolicyParetoScoreTransformerRecommendation17);
        org.junit.Assert.assertNotNull(score18);
         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "f2f7c714-724c-4121-8f57-851dd10449e4" + "'", str19, "f2f7c714-724c-4121-8f57-851dd10449e4");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }
}