package com.webank.wedatasphere.linkis.configuration.service

import com.webank.wedatasphere.linkis.common.utils.Logging
import com.webank.wedatasphere.linkis.protocol.BroadcastProtocol
import com.webank.wedatasphere.linkis.protocol.config.BroadcastConfigChange
import com.webank.wedatasphere.linkis.rpc.{BroadcastListener, Sender}

/**
 * config broadcast
 * wangxy
 */
trait ConfigBroadcastListener extends BroadcastListener with Logging

class ConfigChangedBroadcastListener extends ConfigBroadcastListener {
  private var configurationService: ConfigurationService = _

  def this(configurationService: ConfigurationService) {
    this()
    this.configurationService = configurationService
  }

  override def onBroadcastEvent(protocol: BroadcastProtocol, sender: Sender): Unit = protocol match {
    case BroadcastConfigChange(userName) =>
      configurationService.clearConfigCache(userName)
    case _ =>
  }
}
