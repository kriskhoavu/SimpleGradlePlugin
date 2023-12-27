package com.kris.gradle;

import org.apache.commons.lang3.StringUtils;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskContainer;

import java.util.List;

class ExternalPlugin implements Plugin<Project> {
	@Override
	public void apply(final Project project) {
		project.getPlugins().apply("com.kris.gradle.internal1");
		project.getPlugins().apply("com.kris.gradle.internal2");

//        System.out.println("Applying ExternalPlugin... ");
		final TaskContainer tasks = project.getTasks();
		
		tasks.register("external", task -> {
			task.setDependsOn(List.of(tasks.named("internal1"), tasks.named("internal2")));
			System.out.println("========== Result: " + StringUtils.capitalize("external-plugin"));
		});
	}
}
