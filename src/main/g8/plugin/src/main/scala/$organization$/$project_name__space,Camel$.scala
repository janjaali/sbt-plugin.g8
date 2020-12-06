package $organization$

import sbt.{AllRequirements, AutoPlugin, PluginTrigger}

object $project_name;format="space,Camel"$ extends AutoPlugin {

  override def trigger: PluginTrigger = AllRequirements

}
