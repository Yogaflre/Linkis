package com.webank.wedatasphere.linkis.udf.api.rpc

import com.webank.wedatasphere.linkis.common.utils.Logging
import com.webank.wedatasphere.linkis.protocol.BroadcastProtocol
import com.webank.wedatasphere.linkis.rpc.{BroadcastListener, Sender}
import com.webank.wedatasphere.linkis.udf.service.UDFTreeService
import scala.collection.JavaConverters._
/**
 * udf broadcast
 * wangxy
 */
trait UdfBroadcastListener extends BroadcastListener with Logging

class UdfChangedBroadcastListener extends UdfBroadcastListener {

  private var udfTreeService: UDFTreeService = _

  def this(udfTreeService: UDFTreeService) {
    this()
    this.udfTreeService = udfTreeService
  }

  override def onBroadcastEvent(protocol: BroadcastProtocol, sender: Sender): Unit = protocol match {
    case BroadcastUdfChanged(userNames) =>
      udfTreeService.clearUdfCache(userNames.asJava)
    case _ => info("udf no even.")
  }
}
