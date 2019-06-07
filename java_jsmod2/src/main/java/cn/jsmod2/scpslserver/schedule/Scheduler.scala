/*
Jsmod2 is a java-based scpsl server initiated by jsmod2.cn.
It needs to rely on smod2 and proxy. jsmod2 is an open source
free plugin that is released under the GNU license. Please read
the GNU open source license before using the software. To understand
the appropriateness, if infringement, will be handled in accordance
with the law, @Copyright Jsmod2 China,more can see <a href="http://jsmod2.cn">that<a>
 */

package cn.jsmod2.scpslserver.schedule

import java.util.concurrent.{Callable, Executors}


/**
  * 中央线程处理器
  * @author magiclu550 #(code) jsmod2
  */

class Scheduler {

  private val service = Executors.newCachedThreadPool

  def execute(c: Callable[_]): Any = try service.submit(c).get


  def execute(runnable: Runnable)= service.execute(runnable)

  def shutdown : Unit = service.shutdown

  def getPool = service

}
