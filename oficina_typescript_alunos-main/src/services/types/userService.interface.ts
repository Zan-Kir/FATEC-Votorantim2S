import { IDefaultService } from "./defaultService.interface";

export interface IUserService<Payload, ServiceReturn = any>
  extends IDefaultService<Payload, ServiceReturn> {
    getByEmail:(email:string) => Promise<ServiceReturn>
  }
 