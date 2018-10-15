package org.chuzhinov;

import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderErrors;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

public class DroolsService {
    public DroolsService() {
    }

    private static KnowledgeBase readKnowledge() throws IllegalAccessException {
        KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kBuilder.add(ResourceFactory.newClassPathResource("drools/Rules.drl"), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kBuilder.getErrors();

        if (errors.size() > 0) {
            errors.forEach(System.out::println);
            throw new IllegalAccessException("err");
        }

        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kBuilder.getKnowledgePackages());
        return kbase;
    }

    public static void fireRules(ItemCompany itemCompany) {
        try {
            KnowledgeBase knowledgeBase = readKnowledge();
            StatefulKnowledgeSession knowledgeSession = knowledgeBase.newStatefulKnowledgeSession();
            knowledgeSession.insert(itemCompany);
            knowledgeSession.fireAllRules();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
