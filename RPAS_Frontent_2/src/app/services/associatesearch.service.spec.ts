import { TestBed } from '@angular/core/testing';

import { AssociatesearchService } from './associatesearch.service';

describe('AssociatesearchService', () => {
  let service: AssociatesearchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AssociatesearchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
