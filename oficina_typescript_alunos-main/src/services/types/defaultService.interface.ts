export interface IDefaultService<Payload, ServiceReturn = any> {
  create: (data: Payload) => Promise<ServiceReturn>;
  update: (id: number, data: Partial<Payload>) => Promise<ServiceReturn>;
  getAll: () => Promise<ServiceReturn>;
  delete: (id: number) => Promise<ServiceReturn>;
}
