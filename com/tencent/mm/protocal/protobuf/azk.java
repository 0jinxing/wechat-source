package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class azk extends bsr
{
  public String app_id;
  public String kfT;
  public String wmb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10216);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.app_id != null)
        paramArrayOfObject.e(2, this.app_id);
      if (this.wmb != null)
        paramArrayOfObject.e(3, this.wmb);
      if (this.kfT != null)
        paramArrayOfObject.e(4, this.kfT);
      AppMethodBeat.o(10216);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label526;
    label526: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.app_id != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.app_id);
      paramInt = i;
      if (this.wmb != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wmb);
      i = paramInt;
      if (this.kfT != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.kfT);
      AppMethodBeat.o(10216);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10216);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        azk localazk = (azk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10216);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localazk.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(10216);
          paramInt = i;
          break;
        case 2:
          localazk.app_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10216);
          paramInt = i;
          break;
        case 3:
          localazk.wmb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10216);
          paramInt = i;
          break;
        case 4:
          localazk.kfT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10216);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10216);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azk
 * JD-Core Version:    0.6.2
 */